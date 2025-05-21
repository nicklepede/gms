package com.google.android.gms.ads.internal.csi;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.m;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes2.dex */
public final class b {
    public String d;
    public Context e;
    public String f;
    public AtomicBoolean h;
    public File i;
    public final BlockingQueue a = new ArrayBlockingQueue(100);
    public final LinkedHashMap b = new LinkedHashMap();
    public final Map c = new HashMap();
    public final HashSet g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public final Map a(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap.get(str);
            g gVar = (g) this.c.get(str);
            if (gVar == null) {
                gVar = g.a;
            }
            linkedHashMap.put(str, gVar.a(str3, str2));
        }
        return linkedHashMap;
    }

    public final void b(Map map, j jVar) {
        Uri.Builder buildUpon = Uri.parse(this.d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (jVar != null) {
            StringBuilder sb = new StringBuilder(uri);
            String str = jVar.a;
            if (!TextUtils.isEmpty(str)) {
                sb.append("&it=");
                sb.append(str);
            }
            String str2 = jVar.b;
            if (!TextUtils.isEmpty(str2)) {
                sb.append("&blat=");
                sb.append(str2);
            }
            uri = sb.toString();
        }
        if (!this.h.get()) {
            com.google.android.gms.ads.internal.c.e();
            m.j(this.e, this.f, uri);
            return;
        }
        File file = this.i;
        if (file == null) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.k("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(uri.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        int i2 = com.google.android.gms.ads.internal.util.c.a;
                        com.google.android.gms.ads.internal.util.client.h.m("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    int i3 = com.google.android.gms.ads.internal.util.c.a;
                    com.google.android.gms.ads.internal.util.client.h.m("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            com.google.android.gms.ads.internal.util.client.h.m("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            int i4 = com.google.android.gms.ads.internal.util.c.a;
                            com.google.android.gms.ads.internal.util.client.h.m("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
