package com.google.android.gms.audit.service;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auri;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.evop;
import defpackage.evoq;
import defpackage.fgpr;
import defpackage.fmsq;
import defpackage.wio;
import java.util.Collections;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuditApiChimeraService extends bzot {
    public AuditApiChimeraService() {
        super(154, "com.google.android.gms.audit.service.START", Collections.EMPTY_SET, 1, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        LocaleList locales;
        int size;
        Locale locale;
        evop evopVar = (evop) evoq.a.v();
        String str = Build.ID;
        if (!evopVar.b.L()) {
            evopVar.U();
        }
        evoq evoqVar = (evoq) evopVar.b;
        str.getClass();
        evoqVar.b |= 2;
        evoqVar.d = str;
        int i = Build.VERSION.SDK_INT;
        if (!evopVar.b.L()) {
            evopVar.U();
        }
        evoq evoqVar2 = (evoq) evopVar.b;
        evoqVar2.b |= 1;
        evoqVar2.c = i;
        String str2 = getServiceRequest.f;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(str2, 0);
            int i2 = packageInfo.versionCode;
            if (!evopVar.b.L()) {
                evopVar.U();
            }
            evoq evoqVar3 = (evoq) evopVar.b;
            evoqVar3.b |= 8;
            evoqVar3.f = i2;
            if (packageInfo.versionName != null) {
                String str3 = packageInfo.versionName;
                if (!evopVar.b.L()) {
                    evopVar.U();
                }
                evoq evoqVar4 = (evoq) evopVar.b;
                str3.getClass();
                evoqVar4.b |= 4;
                evoqVar4.e = str3;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (!evopVar.b.L()) {
            evopVar.U();
        }
        evoq evoqVar5 = (evoq) evopVar.b;
        str2.getClass();
        evoqVar5.b |= 16;
        evoqVar5.g = str2;
        String num = Integer.toString(251864004);
        if (!evopVar.b.L()) {
            evopVar.U();
        }
        evoq evoqVar6 = (evoq) evopVar.b;
        num.getClass();
        evoqVar6.b |= 32;
        evoqVar6.h = num;
        String num2 = Integer.toString(getServiceRequest.e);
        if (!evopVar.b.L()) {
            evopVar.U();
        }
        evoq evoqVar7 = (evoq) evopVar.b;
        num2.getClass();
        evoqVar7.b |= 64;
        evoqVar7.i = num2;
        String str4 = Build.MANUFACTURER + " " + Build.MODEL;
        if (!evopVar.b.L()) {
            evopVar.U();
        }
        evoq evoqVar8 = (evoq) evopVar.b;
        evoqVar8.b |= 128;
        evoqVar8.j = str4;
        Configuration configuration = getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            size = locales.size();
            long min = Math.min(size, fmsq.a.lK().a());
            for (int i3 = 0; i3 < min; i3++) {
                locale = locales.get(i3);
                evopVar.a(locale.toLanguageTag());
            }
        } else {
            String languageTag = configuration.locale.toLanguageTag();
            if (languageTag != null) {
                evopVar.a(languageTag);
            }
        }
        fgpr w = fgpr.w(auri.d(ModuleManager.get(this)).a());
        if (!evopVar.b.L()) {
            evopVar.U();
        }
        evoq evoqVar9 = (evoq) evopVar.b;
        evoqVar9.b |= 256;
        evoqVar9.l = w;
        bzozVar.c(new wio((evoq) evopVar.Q(), l(), getServiceRequest.f, getServiceRequest.p));
    }
}
