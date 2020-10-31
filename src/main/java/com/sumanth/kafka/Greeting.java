package com.sumanth.kafka;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public @Data class Greeting {
	  private @NonNull String msg;
	    private @NonNull String name;


}
