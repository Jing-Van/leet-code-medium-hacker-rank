// interesting, whne I did num%val==0
// it failed

bool is_smart_number(int num) {
    int val = (int) sqrt(num);
    if(num == val*val)
        return true;
    return false;
}
