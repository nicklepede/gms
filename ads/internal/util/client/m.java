package com.google.android.gms.ads.internal.util.client;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class m implements e {
    private final String a;

    public m(String str) {
        this.a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.ads.internal.util.client.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = ". "
            java.lang.String r1 = "Error while pinging URL: "
            java.lang.String r2 = "Error while parsing ping URL: "
            boolean r3 = defpackage.aurj.d()     // Catch: java.lang.Throwable -> L8c java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> Lab java.lang.IndexOutOfBoundsException -> Lad
            if (r3 == 0) goto L11
            r3 = 263(0x107, float:3.69E-43)
            android.net.TrafficStats.setThreadStatsTag(r3)     // Catch: java.lang.Throwable -> L8c java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> Lab java.lang.IndexOutOfBoundsException -> Lad
        L11:
            java.lang.String r3 = "Pinging URL: "
            java.lang.String r3 = defpackage.a.x(r8, r3)     // Catch: java.lang.Throwable -> L8c java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> Lab java.lang.IndexOutOfBoundsException -> Lad
            com.google.android.gms.ads.internal.util.client.h.d(r3)     // Catch: java.lang.Throwable -> L8c java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> Lab java.lang.IndexOutOfBoundsException -> Lad
            java.net.URI r3 = new java.net.URI     // Catch: java.lang.Throwable -> L8c java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> Lab java.lang.IndexOutOfBoundsException -> Lad
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L8c java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> Lab java.lang.IndexOutOfBoundsException -> Lad
            java.net.URL r3 = r3.toURL()     // Catch: java.lang.Throwable -> L8c java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> Lab java.lang.IndexOutOfBoundsException -> Lad
            bzrr r4 = defpackage.bzrr.b()     // Catch: java.lang.Throwable -> L8c java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> Lab java.lang.IndexOutOfBoundsException -> Lad
            java.lang.String r5 = "client-admob"
            java.net.URLConnection r3 = r4.a(r3, r5)     // Catch: java.lang.Throwable -> L8c java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> Lab java.lang.IndexOutOfBoundsException -> Lad
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L8c java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> Lab java.lang.IndexOutOfBoundsException -> Lad
            com.google.android.gms.ads.internal.client.u.b()     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = r7.a     // Catch: java.lang.Throwable -> L87
            r5 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r5)     // Catch: java.lang.Throwable -> L87
            r6 = 1
            r3.setInstanceFollowRedirects(r6)     // Catch: java.lang.Throwable -> L87
            r3.setReadTimeout(r5)     // Catch: java.lang.Throwable -> L87
            if (r4 == 0) goto L48
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)     // Catch: java.lang.Throwable -> L87
        L48:
            r4 = 0
            r3.setUseCaches(r4)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.ads.internal.util.client.g r4 = new com.google.android.gms.ads.internal.util.client.g     // Catch: java.lang.Throwable -> L87
            r4.<init>()     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.ads.internal.util.client.g.a()     // Catch: java.lang.Throwable -> L87
            int r4 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.ads.internal.util.client.g.a()     // Catch: java.lang.Throwable -> L87
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 < r5) goto L78
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 < r5) goto L64
            goto L78
        L64:
            com.google.android.gms.ads.internal.config.g r4 = com.google.android.gms.ads.internal.config.p.bg     // Catch: java.lang.Throwable -> L87
            java.lang.Object r4 = r4.g()     // Catch: java.lang.Throwable -> L87
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L87
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L87
            if (r4 == 0) goto L83
            java.lang.String r4 = "X-Afma-Ad-Event-Value"
            r3.getHeaderField(r4)     // Catch: java.lang.Throwable -> L87
            goto L83
        L78:
            java.lang.String r5 = "Received non-success response code "
            java.lang.String r6 = " from pinging URL: "
            java.lang.String r4 = defpackage.a.q(r8, r4, r5, r6)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.ads.internal.util.client.h.k(r4)     // Catch: java.lang.Throwable -> L87
        L83:
            r3.disconnect()     // Catch: java.lang.Throwable -> L8c java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> Lab java.lang.IndexOutOfBoundsException -> Lad
            goto Lc7
        L87:
            r4 = move-exception
            r3.disconnect()     // Catch: java.lang.Throwable -> L8c java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> Lab java.lang.IndexOutOfBoundsException -> Lad
            throw r4     // Catch: java.lang.Throwable -> L8c java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> Lab java.lang.IndexOutOfBoundsException -> Lad
        L8c:
            r8 = move-exception
            goto Ld1
        L8e:
            r2 = move-exception
            goto L91
        L90:
            r2 = move-exception
        L91:
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L8c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L8c
            r3.append(r8)     // Catch: java.lang.Throwable -> L8c
            r3.append(r0)     // Catch: java.lang.Throwable -> L8c
            r3.append(r2)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.ads.internal.util.client.h.k(r8)     // Catch: java.lang.Throwable -> L8c
            goto Lc7
        Lab:
            r1 = move-exception
            goto Lae
        Lad:
            r1 = move-exception
        Lae:
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L8c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L8c
            r3.append(r8)     // Catch: java.lang.Throwable -> L8c
            r3.append(r0)     // Catch: java.lang.Throwable -> L8c
            r3.append(r1)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.ads.internal.util.client.h.k(r8)     // Catch: java.lang.Throwable -> L8c
        Lc7:
            boolean r8 = defpackage.aurj.d()
            if (r8 == 0) goto Ld0
            android.net.TrafficStats.clearThreadStatsTag()
        Ld0:
            return
        Ld1:
            boolean r0 = defpackage.aurj.d()
            if (r0 == 0) goto Lda
            android.net.TrafficStats.clearThreadStatsTag()
        Lda:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.client.m.a(java.lang.String):void");
    }

    public m() {
        this(null);
    }
}
