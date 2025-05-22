package com.google.android.gms.gmscompliance.service;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.gmscompliance.AppContextProvider;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.apzg;
import defpackage.asxd;
import defpackage.atvb;
import defpackage.aued;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.dhpk;
import defpackage.eluo;
import defpackage.fpwz;
import defpackage.frdk;
import defpackage.frdn;
import defpackage.ilr;
import defpackage.ilt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class UncertifiedNotificationChimeraService extends GmsTaskChimeraService {
    private static final ausn a = ausn.b("UncertifiedNotificationSvc", auid.GMS_COMPLIANCE);
    private aued b;

    private final aued e() {
        if (this.b == null) {
            this.b = aued.f(this);
        }
        return this.b;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        GmsDeviceComplianceResponse gmsDeviceComplianceResponse;
        if (!fpwz.c()) {
            return 0;
        }
        e().o("UncertifiedNotificationChimeraService", 1, dhpk.AUTH_ACCOUNT_UNCERTIFIED_PROVISIONAL);
        frdk frdkVar = frdk.a;
        long k = frdkVar.lK().k();
        Bundle bundle = null;
        Bundle bundle2 = frdk.c() ? caufVar.b : null;
        if (!frdk.c() || bundle2 == null) {
            gmsDeviceComplianceResponse = null;
        } else {
            gmsDeviceComplianceResponse = new GmsDeviceComplianceResponse();
            gmsDeviceComplianceResponse.d = bundle2.getBoolean("AUTH_IS_PROVISIONAL");
            gmsDeviceComplianceResponse.e = bundle2.getLong("AUTH_PROVISIONAL_EXPIRATION");
        }
        if (gmsDeviceComplianceResponse != null) {
            k = gmsDeviceComplianceResponse.e;
        }
        long currentTimeMillis = k - System.currentTimeMillis();
        if (currentTimeMillis <= 0) {
            d(0L);
            return 0;
        }
        if (currentTimeMillis > 604800000) {
            ((eluo) ((eluo) a.i()).ai((char) 5060)).z("[UncertifiedDevice, UncertifiedNotificationChimeraService] UncertifiedNotificationChimeraService should not be triggered when remaining days to expire registration is %d or more days.", 7);
            return 0;
        }
        d(currentTimeMillis);
        if (frdk.c()) {
            bundle = new Bundle();
            bundle.putBoolean("AUTH_IS_PROVISIONAL", gmsDeviceComplianceResponse.d);
            bundle.putLong("AUTH_PROVISIONAL_EXPIRATION", gmsDeviceComplianceResponse.e);
        }
        long j = (currentTimeMillis % 86400000) / 1000;
        long j2 = frdkVar.lK().j() + j;
        catb catbVar = new catb();
        catbVar.e(j, j2);
        catbVar.t("UncertifiedNotificationTask");
        catbVar.j = "com.google.android.gms.gmscompliance.service.UncertifiedNotificationService";
        catbVar.g(2);
        catbVar.p = true;
        catbVar.v(1);
        catbVar.u = bundle;
        casd.a(this).f(catbVar.b());
        return 0;
    }

    final void d(long j) {
        String quantityString;
        String str;
        Intent intent = new Intent("android.intent.action.VIEW");
        String c = !asxd.e(AppContextProvider.a()) ? null : atvb.c(AppContextProvider.a(), "auth_uncertified_notification_url");
        if (c == null) {
            frdn.c();
            c = "https://support.google.com/googleplay/?p=uncertified_registration";
        }
        intent.setData(Uri.parse(c));
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        if (j <= 0) {
            str = getResources().getString(R.string.uncertified_notification_expired_title);
            quantityString = getResources().getString(R.string.uncertified_notification_expired_content);
        } else {
            long j2 = j / 86400000;
            int i = j % 86400000 > 0 ? 1 : 0;
            String string = getResources().getString(R.string.uncertified_notification_expiring_title);
            int i2 = ((int) j2) + i;
            quantityString = getResources().getQuantityString(R.plurals.uncertified_notification_expiring_content, i2, Integer.valueOf(i2));
            str = string;
        }
        ilt iltVar = new ilt(this);
        iltVar.r(str);
        iltVar.j(quantityString);
        iltVar.n(apzg.a(this, 2131233635));
        iltVar.v(true);
        ilr ilrVar = new ilr();
        ilrVar.d(quantityString);
        iltVar.o(ilrVar);
        iltVar.l = 2;
        iltVar.g = activity;
        e().w("UncertifiedNotificationChimeraService", 1, dhpk.AUTH_ACCOUNT_UNCERTIFIED_PROVISIONAL, iltVar.b());
    }
}
