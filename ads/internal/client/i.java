package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import defpackage.tdi;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class i {
    public static final i a = new i();

    protected i() {
    }

    public final AdRequestParcel a(Context context, bo boVar) {
        String str;
        int i;
        int i2;
        String str2;
        Set set = boVar.b;
        List unmodifiableList = !set.isEmpty() ? DesugarCollections.unmodifiableList(new ArrayList(set)) : null;
        tdi tdiVar = bs.a().a;
        u.b();
        String l = com.google.android.gms.ads.internal.util.client.f.l(context);
        boolean z = boVar.e.contains(l) || new ArrayList(tdiVar.b).contains(l);
        Bundle bundle = boVar.c;
        Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            u.b();
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            while (true) {
                i2 = i + 1;
                if (i2 >= stackTrace.length) {
                    str2 = null;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                String className = stackTraceElement.getClassName();
                i = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (com.google.android.gms.ads.internal.util.client.f.b.equalsIgnoreCase(className) || com.google.android.gms.ads.internal.util.client.f.c.equalsIgnoreCase(className) || com.google.android.gms.ads.internal.util.client.f.d.equalsIgnoreCase(className) || com.google.android.gms.ads.internal.util.client.f.e.equalsIgnoreCase(className) || com.google.android.gms.ads.internal.util.client.f.f.equalsIgnoreCase(className) || com.google.android.gms.ads.internal.util.client.f.g.equalsIgnoreCase(className))) ? 0 : i2;
            }
            str2 = stackTrace[i2].getClassName();
            if (packageName != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(packageName, ".");
                StringBuilder sb = new StringBuilder();
                if (stringTokenizer.hasMoreElements()) {
                    sb.append(stringTokenizer.nextToken());
                    int i3 = 2;
                    while (true) {
                        int i4 = i3 - 1;
                        if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                            break;
                        }
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                    packageName = sb.toString();
                }
                if (str2 != null && !str2.contains(packageName)) {
                    str = str2;
                    boolean z2 = boVar.h;
                    tdi tdiVar2 = bs.a().a;
                    return new AdRequestParcel(8, -1L, bundle2, -1, unmodifiableList, z, Math.max(boVar.d, -1), false, null, null, null, null, bundle, boVar.f, DesugarCollections.unmodifiableList(new ArrayList(boVar.g)), null, str, z2, null, -1, (String) Collections.max(Arrays.asList(null, ""), new Comparator() { // from class: com.google.android.gms.ads.internal.client.h
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return tdi.a.indexOf((String) obj) - tdi.a.indexOf((String) obj2);
                        }
                    }), new ArrayList(boVar.a), 60000, null, 0, boVar.i);
                }
            }
        }
        str = null;
        boolean z22 = boVar.h;
        tdi tdiVar22 = bs.a().a;
        return new AdRequestParcel(8, -1L, bundle2, -1, unmodifiableList, z, Math.max(boVar.d, -1), false, null, null, null, null, bundle, boVar.f, DesugarCollections.unmodifiableList(new ArrayList(boVar.g)), null, str, z22, null, -1, (String) Collections.max(Arrays.asList(null, ""), new Comparator() { // from class: com.google.android.gms.ads.internal.client.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return tdi.a.indexOf((String) obj) - tdi.a.indexOf((String) obj2);
            }
        }), new ArrayList(boVar.a), 60000, null, 0, boVar.i);
    }
}
