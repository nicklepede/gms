package com.google.android.gms.semanticlocationhistory.settings;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.czje;
import defpackage.czlk;
import defpackage.dahq;
import defpackage.dbkw;
import defpackage.erdc;
import defpackage.erdd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SettingsSyncService extends GmsTaskBoundService {
    public static final asot a = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "SettingsSync");
    public static final String b = SettingsSyncService.class.getName();
    private czje c;
    private czlk d;
    private dbkw e;
    private dahq f;

    public static final erdd h(Throwable th) {
        return new erdd(erdc.NO_USER_DATA, th.getMessage());
    }

    private final czje j() {
        if (this.c == null) {
            this.c = new czje();
        }
        return this.c;
    }

    private final czlk k() {
        if (this.d == null) {
            this.d = new czlk(j());
        }
        return this.d;
    }

    public final dahq d() {
        if (this.f == null) {
            this.f = new dahq();
        }
        return this.f;
    }

    public final dbkw e() {
        if (this.e == null) {
            this.e = new dbkw();
        }
        return this.e;
    }

    public final void f(int i) {
        j().k("OdlhSettingsSyncAccount", i);
    }

    public final void g(int i) {
        j().k("OdlhSettingsSyncJob", i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0180  */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.enss im(defpackage.byln r18) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.settings.SettingsSyncService.im(byln):enss");
    }
}
