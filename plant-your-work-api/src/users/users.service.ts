import { Injectable } from '@nestjs/common';
import { User } from '@prisma/client';
import { PrismaService } from "src/prisma/prisma.service";
import * as bcrypt from 'bcrypt';


@Injectable()
export class UsersService {
    constructor(private prismaService: PrismaService) {}

    async createUser(data: { username: string, password: string, email: string, name: string }): Promise<User>{
        return this.prismaService.user.create({
            data: {
                username: data.username,
                password: await bcrypt.hash(data.password, 10),
                email: data.email,
                name: data.name
            }
        })
    }

    

    async findOne(username: string): Promise<User | undefined>{
        return this.prismaService.user.findUnique({
            where: { username: username } 
        })
    }

}