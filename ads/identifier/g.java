package com.google.android.gms.ads.identifier;

import android.util.Log;
import defpackage.bxjb;
import defpackage.bxjf;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class g {
    public static final void a(String str) {
        try {
            try {
                bxjf.a.j();
                HttpURLConnection httpURLConnection = (HttpURLConnection) bxjb.b().a(new URL(str), "client-ads-identifier");
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        Log.w("HttpUrlPinger", defpackage.a.q(str, responseCode, "Received non-success response code ", " from pinging URL: "));
                    }
                    bxjf.c();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                bxjf.c();
            } catch (IndexOutOfBoundsException e2) {
                Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e2.getMessage(), e2);
                bxjf.c();
            } catch (RuntimeException e3) {
                e = e3;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                bxjf.c();
            }
        } catch (Throwable th) {
            bxjf.c();
            throw th;
        }
    }
}
