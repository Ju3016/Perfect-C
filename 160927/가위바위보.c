 #include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{
 int userOddEven = 0;
 int computerOddEven = 0;

 srand(time(NULL));
 computerOddEven = rand() % 3;

 //printf("컴퓨터 발생 난수 : %d\n\n", computerOddEven);

 printf("가위이면 0, 바위이면 1, 보이면 2를 입력하세요 ");
 scanf("%d", &userOddEven);

 if(userOddEven == 0){
  printf("사용자 선택 : 가위\n");
 }else if(userOddEven == 1){
  printf("사용자 선택 : 바위\n");
 }else{
  printf("사용자 선택 : 보\n");
 }

 if(computerOddEven == 0){
  printf("컴퓨터 선택 : 가위\n");
 }else if(computerOddEven == 1){
  printf("컴퓨터 선택 : 바위\n");
 }else{
  printf("컴퓨터 선택 : 보\n");
 }

 if(userOddEven == computerOddEven){
  printf("무승부!!!\n");
 }else if ((userOddEven == 0 && computerOddEven == 2) || (userOddEven == 1 && computerOddEven == 0) || 
                (userOddEven == 2 && computerOddEven == 1)){
  printf("사용자 승!!!\n");
 }else{
  printf("컴퓨터 승!!!\n");
 }

}
