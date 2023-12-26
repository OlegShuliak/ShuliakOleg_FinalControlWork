# Task 1
    cd ControlWork/
    cat > pets
    cat > pack_animals
    cat pets pack_animals > human_friends
    cat human_friends
    ls -l

# Task 2
    cd ControlWork/
    ls -l
    mkdir NewDir
    ls -l
    mv human_friends NewDir/
    ls -l
    cat human_friends

# Task 3
    wget https://dev.mysql.com/get/mysql-apt-config_0.8.29-1_all.deb
    sudo dpkg -i mysql-apt-config_0.8.29-1_all.deb
    sudo apt -f install

# Task 4
    wget http://mirrors.kernel.org/ubuntu/pool/universe/7/7zip/7zip_21.07+dfsg-4_amd64.deb
    sudo dpkg -i 7zip_21.07+dfsg-4_amd64.deb
    sudo apt -f install
    sudo dpkg -r 7zip