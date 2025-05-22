package com.google.android.gms.auth.uncertifieddevice;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.apzg;
import defpackage.aued;
import defpackage.casd;
import defpackage.catb;
import defpackage.catc;
import defpackage.cauf;
import defpackage.dhpk;
import defpackage.dxyi;
import defpackage.fmua;
import defpackage.fmyq;
import defpackage.fnbo;
import defpackage.fnch;
import defpackage.fpwz;
import defpackage.frdk;
import defpackage.ilr;
import defpackage.ilt;
import defpackage.xbw;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UncertifiedNotificationChimeraService extends GmsTaskChimeraService {
    private aued a;

    static Bundle d(GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        if (!frdk.c()) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("AUTH_IS_PROVISIONAL", gmsDeviceComplianceResponse.d);
        bundle.putLong("AUTH_PROVISIONAL_EXPIRATION", gmsDeviceComplianceResponse.e);
        return bundle;
    }

    static catc e(long j, long j2, Bundle bundle) {
        catb catbVar = new catb();
        catbVar.e(j, j2);
        catbVar.t("UncertifiedNotificationTask");
        catbVar.j = "com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationService";
        catbVar.g(2);
        catbVar.p = true;
        catbVar.v(1);
        catbVar.u = bundle;
        return catbVar.b();
    }

    public static boolean g(boolean z, long j) {
        return !z || j - System.currentTimeMillis() > 604800000;
    }

    private final aued h() {
        if (this.a == null) {
            this.a = aued.f(this);
        }
        return this.a;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!fpwz.c()) {
            h().o("UncertifiedNotificationChimeraService", 1, dhpk.AUTH_ACCOUNT_UNCERTIFIED_PROVISIONAL);
            dxyi dxyiVar = xbw.a;
            long b = fmyq.b();
            GmsDeviceComplianceResponse gmsDeviceComplianceResponse = null;
            Bundle bundle = frdk.c() ? caufVar.b : null;
            if (frdk.c() && bundle != null) {
                gmsDeviceComplianceResponse = new GmsDeviceComplianceResponse();
                gmsDeviceComplianceResponse.d = bundle.getBoolean("AUTH_IS_PROVISIONAL");
                gmsDeviceComplianceResponse.e = bundle.getLong("AUTH_PROVISIONAL_EXPIRATION");
            }
            if (gmsDeviceComplianceResponse != null) {
                b = gmsDeviceComplianceResponse.e;
            }
            long currentTimeMillis = b - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                f(0L);
            } else if (currentTimeMillis <= 604800000) {
                f(currentTimeMillis);
                long j = (currentTimeMillis % 86400000) / 1000;
                casd.a(this).f(e(j, fnbo.h() + j, d(gmsDeviceComplianceResponse)));
            } else {
                Log.e("Auth", String.format(Locale.US, "[UncertifiedDevice, UncertifiedNotificationChimeraService] UncertifiedNotificationChimeraService should not be triggered when remaining days to expire registration is 7 or more days.", new Object[0]));
            }
        }
        return 0;
    }

    final void f(long j) {
        String str;
        String quantityString;
        String str2;
        Intent intent = new Intent("android.intent.action.VIEW");
        dxyi dxyiVar = xbw.a;
        if (fmua.h()) {
            str = xbw.l("uncertified_notification_url");
            if (str == null) {
                fnch.c();
                str = "https://support.google.com/googleplay/?p=uncertified_registration";
            }
        } else {
            str = (String) xbw.C.b();
        }
        intent.setData(Uri.parse(str));
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        if (j <= 0) {
            str2 = getResources().getString(R.string.uncertified_notification_expired_title);
            quantityString = getResources().getString(R.string.uncertified_notification_expired_content);
        } else {
            long j2 = j / 86400000;
            int i = j % 86400000 > 0 ? 1 : 0;
            String string = getResources().getString(R.string.uncertified_notification_expiring_title);
            int i2 = ((int) j2) + i;
            quantityString = getResources().getQuantityString(R.plurals.uncertified_notification_expiring_content, i2, Integer.valueOf(i2));
            str2 = string;
        }
        ilt iltVar = new ilt(this);
        iltVar.r(str2);
        iltVar.j(quantityString);
        iltVar.n(apzg.a(this, 2131233635));
        iltVar.v(true);
        ilr ilrVar = new ilr();
        ilrVar.d(quantityString);
        iltVar.o(ilrVar);
        iltVar.l = 2;
        iltVar.g = activity;
        h().w("UncertifiedNotificationChimeraService", 1, dhpk.AUTH_ACCOUNT_UNCERTIFIED_PROVISIONAL, iltVar.b());
    }
}
