package com.google.android.gms.backup.g1.restore.mms;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.ahwd;
import defpackage.aiei;
import defpackage.aies;
import defpackage.ajgv;
import defpackage.asoo;
import defpackage.bqux;
import defpackage.flmm;
import defpackage.fmut;
import java.io.File;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BugleRestoreCompleteIntentOperation extends IntentOperation {
    private static final ahwd a = new ahwd("BugleRestoreCompleteIntentOperation");
    private static final Uri b = new Uri.Builder().scheme("content").authority("com.google.android.gms.fileprovider").appendPath("mms").build();

    private final void a() {
        try {
            asoo.e(fmut.i() ? new File(bqux.a.b(getFilesDir(), "mms")) : new File(getFilesDir(), "mms"));
            aiei aieiVar = new aiei(this);
            asoo.e(aieiVar.b);
            asoo.e(aieiVar.a);
            aies.f(this);
        } catch (Exception e) {
            a.n("Error cleaning up file.", e, new Object[0]);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ajgv ajgvVar = ajgv.a;
        if (ajgv.l(this)) {
            a.j("MMS restore is complete", new Object[0]);
            return;
        }
        if (!ajgv.m(this)) {
            a.j("MMS restore was not started", new Object[0]);
            return;
        }
        if (intent == null) {
            a.j("No intent provided, ignoring", new Object[0]);
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            a.j("No action provided, ignoring", new Object[0]);
            return;
        }
        if (action.equals("com.google.android.gms.backup.g1.BUGLE_RESTORE_ABORT")) {
            a.j("MMS restore was aborted", new Object[0]);
            if (flmm.a.a().aC()) {
                ajgvVar.b(this, false);
            } else {
                ajgvVar.b(this, true);
            }
            a();
            revokeUriPermission(b, 1);
            return;
        }
        if (!action.equals("com.google.android.gms.backup.g1.BUGLE_RESTORE_COMPLETE")) {
            a.j("Unrecognized action provided, ignoring", new Object[0]);
            return;
        }
        int intExtra = intent.getIntExtra("com.google.android.gms.backup.g1.BUGLE_RESTORE_RESULT_CODE", 1);
        if (intExtra == 0) {
            ajgvVar.b(this, true);
            a();
            a.j("MMS restore completed successfully", new Object[0]);
        } else if (intExtra == 1) {
            a.j("MMS restore failed", new Object[0]);
        } else if (intExtra != 2) {
            a.j("MMS restore completed; result code is unrecognized", new Object[0]);
        } else {
            a.j("MMS restore failed; was not default sms provider", new Object[0]);
        }
        revokeUriPermission(b, 1);
    }
}
