package com.google.android.gms.semanticlocationhistory.settings;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dcry;
import defpackage.ddvc;
import defpackage.etry;
import defpackage.etrz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SettingsSyncService extends GmsTaskBoundService {
    public static final ausn a = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "SettingsSync");
    public static final String b = SettingsSyncService.class.getName();
    private dbtc c;
    private dbvg d;
    private ddvc e;
    private dcry f;

    public static final etrz h(Throwable th) {
        return new etrz(etry.NO_USER_DATA, th.getMessage());
    }

    private final dbtc j() {
        if (this.c == null) {
            this.c = new dbtc();
        }
        return this.c;
    }

    private final dbvg k() {
        if (this.d == null) {
            this.d = new dbvg(j());
        }
        return this.d;
    }

    public final dcry d() {
        if (this.f == null) {
            this.f = new dcry();
        }
        return this.f;
    }

    public final ddvc e() {
        if (this.e == null) {
            this.e = new ddvc();
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
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0180  */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.eqgl iB(defpackage.cauf r18) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.settings.SettingsSyncService.iB(cauf):eqgl");
    }
}
