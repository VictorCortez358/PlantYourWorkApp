import { Body, Controller, Post, HttpCode, HttpStatus } from '@nestjs/common';
import { AuthService } from './auth.service';
import { User } from '@prisma/client';
import { UsersService } from 'src/users/users.service';
import { SignInDto } from './dto/SignInDto';
import { RegisterInDto } from './dto/RegisterInDto';

@Controller('auth')
export class AuthController {
    constructor(private authService: AuthService, private userService: UsersService) { }

    @HttpCode(HttpStatus.OK)
    @Post('login')
    async signIn(@Body() signInDto: SignInDto) {
        return this.authService.signIn(signInDto.username, signInDto.password);
    }

    @HttpCode(HttpStatus.OK)
    @Post('register')
    async createUser(@Body() registerInDto: RegisterInDto): Promise<User> {
        return this.userService.createUser(registerInDto)
    }
}
