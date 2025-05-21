package com.google.android.gms.fido.authenticator.autoenroll;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.fido.AppContextProvider;
import defpackage.asit;
import defpackage.barc;
import defpackage.bare;
import defpackage.bazf;
import defpackage.bazo;
import defpackage.bbcd;
import defpackage.bcnj;
import defpackage.bcnk;
import defpackage.bcnl;
import defpackage.bcno;
import defpackage.bcnp;
import defpackage.bcod;
import defpackage.bxdf;
import defpackage.bxek;
import defpackage.fnyl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FidoKeyValidityCheckIntentOperation extends IntentOperation {
    private static final bcnj a = new bcnj("FidoKeyValidityCheckIntentOperation");
    private final Context b;
    private final bcnl c;
    private final bcod d;
    private final bazf e;
    private final bbcd f;
    private final bazo g;
    private final bxdf h;
    private final bcnp i;

    public FidoKeyValidityCheckIntentOperation() {
        this.b = this;
        this.c = bcnl.a(bcnk.FIDO_KEY_VALIDITY_CHECK_V2);
        this.d = (bcod) bcod.b.b();
        this.e = new bazf(this);
        this.f = new bbcd();
        this.g = new bazo(this);
        this.h = bxek.a(AppContextProvider.a(), "fido", "com.google.android.gms.fido.authenticator.autoenroll.FidoKeyValidityCheck", 0);
        this.i = bcno.a();
    }

    public static void a(Context context, String str) {
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, FidoKeyValidityCheckIntentOperation.class, new Intent("com.google.android.gms.fido.authenticator.autoenroll.FIDO_KEY_VALIDITY_CHECK_DELAY_COMPLETE"), 0, 134217728);
        asit asitVar = new asit(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long a2 = fnyl.a.a().a();
        asitVar.d("FidoKeyValidityCheckIntentOperation", 2, elapsedRealtime + (a2 / 2) + ((long) (Math.random() * a2)), pendingIntent, str);
    }

    private final void b(Throwable th) {
        this.i.E(this.c, barc.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_ERROR, bare.KEY_TYPE_KEYSTORE, 2, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d5 A[Catch: bbnh -> 0x0219, bcoc -> 0x021c, TryCatch #8 {bbnh -> 0x0219, bcoc -> 0x021c, blocks: (B:23:0x0190, B:25:0x01a3, B:27:0x01b1, B:30:0x01c9, B:31:0x01cf, B:33:0x01d5, B:34:0x01e7, B:37:0x01ef, B:39:0x0208), top: B:22:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4 A[Catch: bcoc -> 0x015a, TryCatch #5 {bcoc -> 0x015a, blocks: (B:73:0x00c3, B:76:0x00da, B:77:0x00de, B:79:0x00e4, B:86:0x0134, B:88:0x0127, B:89:0x012e), top: B:72:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.authenticator.autoenroll.FidoKeyValidityCheckIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    FidoKeyValidityCheckIntentOperation(Context context, bcnl bcnlVar, bcod bcodVar, bazf bazfVar, bbcd bbcdVar, bazo bazoVar, bxdf bxdfVar, bcnp bcnpVar) {
        this.b = context;
        this.c = bcnlVar;
        this.d = bcodVar;
        this.e = bazfVar;
        this.f = bbcdVar;
        this.g = bazoVar;
        this.h = bxdfVar;
        this.i = bcnpVar;
    }
}
