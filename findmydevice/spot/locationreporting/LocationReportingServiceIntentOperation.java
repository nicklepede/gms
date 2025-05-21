package com.google.android.gms.findmydevice.spot.locationreporting;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bebo;
import defpackage.belh;
import defpackage.belz;
import defpackage.beup;
import defpackage.dwvv;
import defpackage.egjy;
import defpackage.egmm;
import defpackage.eufn;
import defpackage.fecj;
import defpackage.fobb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class LocationReportingServiceIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("LocReportingSvcIntOp", asej.FIND_MY_DEVICE_SPOT);
    private final dwvv c;
    private final belz d;
    private final beup e;

    public LocationReportingServiceIntentOperation() {
        this(bebo.a());
    }

    private static Account a(Intent intent) {
        return (Account) intent.getParcelableExtra("account");
    }

    private static egjy b(String str) {
        if (fobb.a.a().i()) {
            return egmm.e("com/google/android/gms/findmydevice/spot/locationreporting/LocationReportingServiceIntentOperation", "beginSpan", 146, str);
        }
        return null;
    }

    private static eufn c(Intent intent) {
        String stringExtra = intent.getStringExtra("device_id");
        if (stringExtra == null) {
            return null;
        }
        fecj v = eufn.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ((eufn) v.b).b = stringExtra;
        return (eufn) v.Q();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0335 A[Catch: all -> 0x03a1, TryCatch #0 {all -> 0x03a1, blocks: (B:133:0x01a6, B:135:0x01ac, B:140:0x01bb, B:144:0x01de, B:145:0x01ed, B:147:0x01f8, B:149:0x0206, B:151:0x0209, B:153:0x0211, B:154:0x0221, B:156:0x0227, B:158:0x0254, B:159:0x0257, B:161:0x0274, B:162:0x0277, B:164:0x0285, B:165:0x0288, B:168:0x02a1, B:170:0x02ab, B:172:0x02bf, B:173:0x02c2, B:176:0x02cf, B:179:0x0335, B:180:0x0343, B:182:0x034e, B:183:0x035c, B:184:0x0365, B:186:0x036b, B:188:0x038c, B:190:0x02e5, B:192:0x02f3, B:194:0x02f6, B:197:0x030a, B:200:0x0320, B:204:0x032f, B:206:0x01c5), top: B:132:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0343 A[Catch: all -> 0x03a1, TryCatch #0 {all -> 0x03a1, blocks: (B:133:0x01a6, B:135:0x01ac, B:140:0x01bb, B:144:0x01de, B:145:0x01ed, B:147:0x01f8, B:149:0x0206, B:151:0x0209, B:153:0x0211, B:154:0x0221, B:156:0x0227, B:158:0x0254, B:159:0x0257, B:161:0x0274, B:162:0x0277, B:164:0x0285, B:165:0x0288, B:168:0x02a1, B:170:0x02ab, B:172:0x02bf, B:173:0x02c2, B:176:0x02cf, B:179:0x0335, B:180:0x0343, B:182:0x034e, B:183:0x035c, B:184:0x0365, B:186:0x036b, B:188:0x038c, B:190:0x02e5, B:192:0x02f3, B:194:0x02f6, B:197:0x030a, B:200:0x0320, B:204:0x032f, B:206:0x01c5), top: B:132:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[Catch: all -> 0x0121, TRY_ENTER, TryCatch #1 {all -> 0x0121, blocks: (B:37:0x00ae, B:39:0x00b4, B:44:0x00c2, B:57:0x00ca, B:48:0x00d9, B:49:0x00e7, B:51:0x00ed, B:52:0x00fb, B:54:0x010d, B:55:0x010f), top: B:36:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7 A[Catch: all -> 0x0121, TryCatch #1 {all -> 0x0121, blocks: (B:37:0x00ae, B:39:0x00b4, B:44:0x00c2, B:57:0x00ca, B:48:0x00d9, B:49:0x00e7, B:51:0x00ed, B:52:0x00fb, B:54:0x010d, B:55:0x010f), top: B:36:0x00ae }] */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.findmydevice.spot.locationreporting.LocationReportingServiceIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    public LocationReportingServiceIntentOperation(belh belhVar) {
        this.c = belhVar.E();
        this.d = belhVar.q();
        this.e = belhVar.v();
    }
}
