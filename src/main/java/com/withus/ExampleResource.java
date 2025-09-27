package com.withus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.math.BigInteger;

@Path("/labseq")
public class ExampleResource {

    private static final int[] val = {0, 1, 0, 1};

    @GET
    @Path("/{n}")
    @Produces(MediaType.TEXT_PLAIN)
    public BigInteger labseq(@PathParam("n") int n) {
        return calculate(n);
    }
    private static BigInteger calculate(int num) {
        BigInteger[] dp = new BigInteger[num + 1];

        for (int i = 0; i < 4 && i <= num; i++) {
            dp[i] = BigInteger.valueOf(val[i]);
        }

        for (int i = 4; i <= num; i++) {
            dp[i] = dp[i - 4].add(dp[i - 3]);
        }
        return dp[num];
    }

}
