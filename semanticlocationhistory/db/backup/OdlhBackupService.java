package com.google.android.gms.semanticlocationhistory.db.backup;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.czje;
import defpackage.czlk;
import defpackage.dafx;
import defpackage.dahq;
import defpackage.dbhz;
import defpackage.ensv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OdlhBackupService extends GmsTaskBoundService {
    public final dafx b;
    public czlk c;
    public final ensv d;
    private dahq f;
    private dbhz g;
    private czje h;
    private static final asot e = asot.b("OdlhBackupService", asej.SEMANTIC_LOCATION_HISTORY);
    public static final String a = OdlhBackupService.class.getName();

    public OdlhBackupService() {
        this.d = new asmf(1, 10);
        this.b = new dafx();
    }

    private final dbhz f() {
        if (this.g == null) {
            this.g = new dbhz();
        }
        return this.g;
    }

    public final czje d() {
        if (this.h == null) {
            this.h = new czje();
        }
        return this.h;
    }

    public final dahq e() {
        if (this.f == null) {
            this.f = new dahq();
        }
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.enss im(defpackage.byln r18) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.db.backup.OdlhBackupService.im(byln):enss");
    }

    OdlhBackupService(dafx dafxVar) {
        this.d = new asmf(1, 10);
        this.b = dafxVar;
    }
}
