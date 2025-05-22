package com.google.android.gms.ads.identifier;

import android.util.Log;
import defpackage.bzrr;
import defpackage.bzrv;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class g {
    public static final void a(String str) {
        try {
            try {
                bzrv.a.j();
                HttpURLConnection httpURLConnection = (HttpURLConnection) bzrr.b().a(new URL(str), "client-ads-identifier");
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        Log.w("HttpUrlPinger", defpackage.a.q(str, responseCode, "Received non-success response code ", " from pinging URL: "));
                    }
                    bzrv.c();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                bzrv.c();
            } catch (IndexOutOfBoundsException e2) {
                Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e2.getMessage(), e2);
                bzrv.c();
            } catch (RuntimeException e3) {
                e = e3;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                bzrv.c();
            }
        } catch (Throwable th) {
            bzrv.c();
            throw th;
        }
    }
}
