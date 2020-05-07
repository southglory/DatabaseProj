package SSSP.kitchen;

import java.util.ArrayList;
import java.util.Scanner;

import Kitchen_TEST_DUMMY.Product;

public interface Service {
 
void addProduct(Scanner sc);

void printProduct(Scanner sc);//제품번호로 검색하여 제품출력

void printAll();//전체검색한 목록 출력

void getByName(Scanner sc);//이름으로 검색하여 목록 출력

void editPrice(Scanner sc);//제품 번호, 새가격 입력받아서 수정

void in(Scanner sc);//입고:제품번호와 입고수량 입력받아서 처리



void delProduct(Scanner sc);//제품 번호 입력받아 삭제

Product getByNum(int num);//주문쪽에 
ArrayList<Product> getAll();
}
