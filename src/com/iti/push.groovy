package com.iti;

def push(IMAGE_NAME, IMAGE_TAG){
    sh "docker push ${IMAGE_NAME}:${IMAGE_TAG}"
}
