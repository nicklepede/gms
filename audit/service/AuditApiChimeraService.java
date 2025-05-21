package com.google.android.gms.audit.service;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asno;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.esyz;
import defpackage.esza;
import defpackage.feay;
import defpackage.fkce;
import defpackage.ump;
import java.util.Collections;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuditApiChimeraService extends bxgd {
    public AuditApiChimeraService() {
        super(154, "com.google.android.gms.audit.service.START", Collections.EMPTY_SET, 1, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        LocaleList locales;
        int size;
        Locale locale;
        esyz esyzVar = (esyz) esza.a.v();
        String str = Build.ID;
        if (!esyzVar.b.L()) {
            esyzVar.U();
        }
        esza eszaVar = (esza) esyzVar.b;
        str.getClass();
        eszaVar.b |= 2;
        eszaVar.d = str;
        int i = Build.VERSION.SDK_INT;
        if (!esyzVar.b.L()) {
            esyzVar.U();
        }
        esza eszaVar2 = (esza) esyzVar.b;
        eszaVar2.b |= 1;
        eszaVar2.c = i;
        String str2 = getServiceRequest.f;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(str2, 0);
            int i2 = packageInfo.versionCode;
            if (!esyzVar.b.L()) {
                esyzVar.U();
            }
            esza eszaVar3 = (esza) esyzVar.b;
            eszaVar3.b |= 8;
            eszaVar3.f = i2;
            if (packageInfo.versionName != null) {
                String str3 = packageInfo.versionName;
                if (!esyzVar.b.L()) {
                    esyzVar.U();
                }
                esza eszaVar4 = (esza) esyzVar.b;
                str3.getClass();
                eszaVar4.b |= 4;
                eszaVar4.e = str3;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (!esyzVar.b.L()) {
            esyzVar.U();
        }
        esza eszaVar5 = (esza) esyzVar.b;
        str2.getClass();
        eszaVar5.b |= 16;
        eszaVar5.g = str2;
        String num = Integer.toString(251661004);
        if (!esyzVar.b.L()) {
            esyzVar.U();
        }
        esza eszaVar6 = (esza) esyzVar.b;
        num.getClass();
        eszaVar6.b |= 32;
        eszaVar6.h = num;
        String num2 = Integer.toString(getServiceRequest.e);
        if (!esyzVar.b.L()) {
            esyzVar.U();
        }
        esza eszaVar7 = (esza) esyzVar.b;
        num2.getClass();
        eszaVar7.b |= 64;
        eszaVar7.i = num2;
        String str4 = Build.MANUFACTURER + " " + Build.MODEL;
        if (!esyzVar.b.L()) {
            esyzVar.U();
        }
        esza eszaVar8 = (esza) esyzVar.b;
        eszaVar8.b |= 128;
        eszaVar8.j = str4;
        Configuration configuration = getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            size = locales.size();
            long min = Math.min(size, fkce.a.a().a());
            for (int i3 = 0; i3 < min; i3++) {
                locale = locales.get(i3);
                esyzVar.a(locale.toLanguageTag());
            }
        } else {
            String languageTag = configuration.locale.toLanguageTag();
            if (languageTag != null) {
                esyzVar.a(languageTag);
            }
        }
        feay w = feay.w(asno.c(ModuleManager.get(this)).a());
        if (!esyzVar.b.L()) {
            esyzVar.U();
        }
        esza eszaVar9 = (esza) esyzVar.b;
        eszaVar9.b |= 256;
        eszaVar9.l = w;
        bxgjVar.c(new ump((esza) esyzVar.Q(), l(), getServiceRequest.f, getServiceRequest.p));
    }
}
