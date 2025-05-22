package com.google.android.gms.people.sync.focus;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.bzpt;
import defpackage.cvts;
import defpackage.cwof;
import defpackage.cxip;
import defpackage.cxmt;
import defpackage.cxoe;
import defpackage.enkb;
import defpackage.enkf;
import defpackage.ftzc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SyncHighResPhotoIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Context applicationContext = getApplicationContext();
        if (!cxip.a(applicationContext)) {
            cwof.c("FSA2_SyncHighResIntentOp", "Gms doesn't have contacts permission.");
            return;
        }
        ftzc.e();
        if ("com.google.android.gms.people.sync.focus.SYNC_HIGH_RES_PHOTO".equals(intent.getAction())) {
            cwof.f("FSA2_SyncHighResIntentOp", "Syncing high-res photo");
            cxmt cxmtVar = new cxmt(applicationContext);
            try {
                try {
                    Uri data = intent.getData();
                    if (data != null) {
                        cxmtVar.b(data);
                    }
                    Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
                    int a = uri != null ? cxoe.a(uri.getAuthority()) : 1;
                    cvts a2 = cvts.a();
                    enkb enkbVar = (enkb) enkf.a.v();
                    if (!enkbVar.b.L()) {
                        enkbVar.U();
                    }
                    enkf enkfVar = (enkf) enkbVar.b;
                    enkfVar.c = 14;
                    enkfVar.b |= 1;
                    if (!enkbVar.b.L()) {
                        enkbVar.U();
                    }
                    enkf enkfVar2 = (enkf) enkbVar.b;
                    enkfVar2.e = a - 1;
                    enkfVar2.b |= 4;
                    if (!enkbVar.b.L()) {
                        enkbVar.U();
                    }
                    enkf enkfVar3 = (enkf) enkbVar.b;
                    enkfVar3.d = 1;
                    enkfVar3.b |= 2;
                    a2.c((enkf) enkbVar.Q());
                } catch (bzpt e) {
                    cwof.d("FSA2_SyncHighResIntentOp", "OperationException", e);
                    Uri uri2 = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
                    int a3 = uri2 != null ? cxoe.a(uri2.getAuthority()) : 1;
                    cvts a4 = cvts.a();
                    enkb enkbVar2 = (enkb) enkf.a.v();
                    if (!enkbVar2.b.L()) {
                        enkbVar2.U();
                    }
                    enkf enkfVar4 = (enkf) enkbVar2.b;
                    enkfVar4.c = 14;
                    enkfVar4.b |= 1;
                    if (!enkbVar2.b.L()) {
                        enkbVar2.U();
                    }
                    enkf enkfVar5 = (enkf) enkbVar2.b;
                    enkfVar5.e = a3 - 1;
                    enkfVar5.b |= 4;
                    if (!enkbVar2.b.L()) {
                        enkbVar2.U();
                    }
                    enkf enkfVar6 = (enkf) enkbVar2.b;
                    enkfVar6.d = 5;
                    enkfVar6.b |= 2;
                    a4.c((enkf) enkbVar2.Q());
                }
            } catch (Throwable th) {
                Uri uri3 = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
                int a5 = uri3 != null ? cxoe.a(uri3.getAuthority()) : 1;
                cvts a6 = cvts.a();
                enkb enkbVar3 = (enkb) enkf.a.v();
                if (!enkbVar3.b.L()) {
                    enkbVar3.U();
                }
                enkf enkfVar7 = (enkf) enkbVar3.b;
                enkfVar7.c = 14;
                enkfVar7.b |= 1;
                if (!enkbVar3.b.L()) {
                    enkbVar3.U();
                }
                enkf enkfVar8 = (enkf) enkbVar3.b;
                enkfVar8.e = a5 - 1;
                enkfVar8.b |= 4;
                if (!enkbVar3.b.L()) {
                    enkbVar3.U();
                }
                enkf enkfVar9 = (enkf) enkbVar3.b;
                enkfVar9.d = 0;
                enkfVar9.b |= 2;
                a6.c((enkf) enkbVar3.Q());
                throw th;
            }
        }
    }
}
