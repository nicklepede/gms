package com.google.android.gms.semanticlocationhistory.db.backup;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dcqf;
import defpackage.dcry;
import defpackage.ddsf;
import defpackage.eqgo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OdlhBackupService extends GmsTaskBoundService {
    public final dcqf b;
    public dbvg c;
    public final eqgo d;
    private dcry f;
    private ddsf g;
    private dbtc h;
    private static final ausn e = ausn.b("OdlhBackupService", auid.SEMANTIC_LOCATION_HISTORY);
    public static final String a = OdlhBackupService.class.getName();

    public OdlhBackupService() {
        this.d = new aupz(1, 10);
        this.b = new dcqf();
    }

    private final ddsf f() {
        if (this.g == null) {
            this.g = new ddsf();
        }
        return this.g;
    }

    public final dbtc d() {
        if (this.h == null) {
            this.h = new dbtc();
        }
        return this.h;
    }

    public final dcry e() {
        if (this.f == null) {
            this.f = new dcry();
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
    public final defpackage.eqgl iB(defpackage.cauf r18) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.db.backup.OdlhBackupService.iB(cauf):eqgl");
    }

    OdlhBackupService(dcqf dcqfVar) {
        this.d = new aupz(1, 10);
        this.b = dcqfVar;
    }
}
