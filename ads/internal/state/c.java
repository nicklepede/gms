package com.google.android.gms.ads.internal.state;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.flag.i;
import com.google.android.gms.ads.internal.flag.j;
import com.google.android.gms.ads.internal.util.m;
import defpackage.bqux;
import defpackage.eiif;
import defpackage.enss;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class c extends com.google.android.gms.ads.internal.util.b {
    final /* synthetic */ e a;

    public c(e eVar) {
        this.a = eVar;
    }

    @Override // com.google.android.gms.ads.internal.util.b
    public final void a() {
        final com.google.android.gms.ads.internal.csi.b bVar;
        File externalStorageDirectory;
        e eVar = this.a;
        Context context = eVar.d;
        String str = eVar.e.a;
        String str2 = (String) i.a.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.c.e();
        linkedHashMap.put("device", m.n());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.c.e();
        linkedHashMap.put("is_lite_sdk", true != m.q(context) ? "0" : "1");
        enss submit = com.google.android.gms.ads.internal.util.future.e.a.submit(new com.google.android.gms.ads.internal.request.service.d(com.google.android.gms.ads.internal.c.a.g, context));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((com.google.android.gms.ads.internal.request.service.c) submit.get()).j));
            linkedHashMap.put("network_fine", Integer.toString(((com.google.android.gms.ads.internal.request.service.c) submit.get()).k));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.c.d().d(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) p.bH.g()).booleanValue()) {
            com.google.android.gms.ads.internal.c.e();
            linkedHashMap.put("is_bstar", "0");
        }
        if (((Boolean) p.bq.g()).booleanValue() && ((Boolean) p.V.g()).booleanValue()) {
            com.google.android.gms.ads.internal.c.d();
            if (!eiif.c(null)) {
                com.google.android.gms.ads.internal.c.d();
                linkedHashMap.put("plugin", null);
            }
        }
        synchronized (eVar.a) {
            try {
                com.google.android.gms.ads.internal.c.i();
                bVar = eVar.f;
            } catch (IllegalArgumentException e2) {
                int i = com.google.android.gms.ads.internal.util.c.a;
                com.google.android.gms.ads.internal.util.client.h.m("Cannot config CSI reporter.", e2);
            }
            if (context == null) {
                throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
            }
            bVar.e = context;
            bVar.f = str;
            bVar.d = str2;
            bVar.h = new AtomicBoolean(false);
            bVar.h.set(((Boolean) j.c.d()).booleanValue());
            if (bVar.h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
                bVar.i = new File(bqux.a.b(externalStorageDirectory, "sdk_csi_data.txt"));
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                bVar.b.put((String) entry.getKey(), (String) entry.getValue());
            }
            com.google.android.gms.ads.internal.util.future.e.a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.csi.a
                @Override // java.lang.Runnable
                public final void run() {
                    j jVar;
                    Map map;
                    b bVar2 = b.this;
                    while (true) {
                        try {
                            k kVar = (k) bVar2.a.take();
                            boolean booleanValue = ((Boolean) p.L.g()).booleanValue();
                            StringBuilder sb = new StringBuilder();
                            HashMap hashMap = new HashMap();
                            Object obj = kVar.c;
                            synchronized (obj) {
                                List<h> list = kVar.a;
                                for (h hVar : list) {
                                    long j = hVar.a;
                                    String str3 = hVar.b;
                                    h hVar2 = hVar.c;
                                }
                                list.clear();
                                String str4 = null;
                                if (!TextUtils.isEmpty(null)) {
                                    sb.append((String) null);
                                } else if (sb.length() > 0) {
                                    sb.setLength(sb.length() - 1);
                                }
                                StringBuilder sb2 = new StringBuilder();
                                if (booleanValue) {
                                    for (Map.Entry entry2 : hashMap.entrySet()) {
                                        sb2.append((CharSequence) entry2.getValue());
                                        sb2.append('.');
                                        long longValue = ((Long) entry2.getKey()).longValue();
                                        com.google.android.gms.ads.internal.c.j();
                                        long currentTimeMillis = System.currentTimeMillis();
                                        com.google.android.gms.ads.internal.c.j();
                                        sb2.append(currentTimeMillis + (longValue - SystemClock.elapsedRealtime()));
                                        sb2.append(',');
                                    }
                                    if (sb2.length() > 0) {
                                        sb2.setLength(sb2.length() - 1);
                                    }
                                    str4 = sb2.toString();
                                }
                                jVar = new j(sb.toString(), str4);
                            }
                            if (!TextUtils.isEmpty(jVar.a)) {
                                LinkedHashMap linkedHashMap2 = bVar2.b;
                                synchronized (obj) {
                                    com.google.android.gms.ads.internal.c.d().a();
                                    map = kVar.b;
                                }
                                bVar2.b(bVar2.a(linkedHashMap2, map), jVar);
                            }
                        } catch (InterruptedException e3) {
                            int i2 = com.google.android.gms.ads.internal.util.c.a;
                            com.google.android.gms.ads.internal.util.client.h.m("CsiReporter:reporter interrupted", e3);
                            return;
                        }
                    }
                }
            });
            Map map = bVar.c;
            map.put("action", com.google.android.gms.ads.internal.csi.g.b);
            map.put("ad_format", com.google.android.gms.ads.internal.csi.g.b);
            map.put("e", com.google.android.gms.ads.internal.csi.g.c);
        }
    }
}
