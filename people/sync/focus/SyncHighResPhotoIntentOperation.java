package com.google.android.gms.people.sync.focus;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.bxhd;
import defpackage.ctkm;
import defpackage.cuey;
import defpackage.cuzh;
import defpackage.cvdk;
import defpackage.cvev;
import defpackage.ekwp;
import defpackage.ekwt;
import defpackage.frfh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SyncHighResPhotoIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Context applicationContext = getApplicationContext();
        if (!cuzh.a(applicationContext)) {
            cuey.c("FSA2_SyncHighResIntentOp", "Gms doesn't have contacts permission.");
            return;
        }
        frfh.e();
        if ("com.google.android.gms.people.sync.focus.SYNC_HIGH_RES_PHOTO".equals(intent.getAction())) {
            cuey.f("FSA2_SyncHighResIntentOp", "Syncing high-res photo");
            cvdk cvdkVar = new cvdk(applicationContext);
            try {
                try {
                    Uri data = intent.getData();
                    if (data != null) {
                        cvdkVar.b(data);
                    }
                    Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
                    int a = uri != null ? cvev.a(uri.getAuthority()) : 1;
                    ctkm a2 = ctkm.a();
                    ekwp ekwpVar = (ekwp) ekwt.a.v();
                    if (!ekwpVar.b.L()) {
                        ekwpVar.U();
                    }
                    ekwt ekwtVar = (ekwt) ekwpVar.b;
                    ekwtVar.c = 14;
                    ekwtVar.b |= 1;
                    if (!ekwpVar.b.L()) {
                        ekwpVar.U();
                    }
                    ekwt ekwtVar2 = (ekwt) ekwpVar.b;
                    ekwtVar2.e = a - 1;
                    ekwtVar2.b |= 4;
                    if (!ekwpVar.b.L()) {
                        ekwpVar.U();
                    }
                    ekwt ekwtVar3 = (ekwt) ekwpVar.b;
                    ekwtVar3.d = 1;
                    ekwtVar3.b |= 2;
                    a2.c((ekwt) ekwpVar.Q());
                } catch (bxhd e) {
                    cuey.d("FSA2_SyncHighResIntentOp", "OperationException", e);
                    Uri uri2 = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
                    int a3 = uri2 != null ? cvev.a(uri2.getAuthority()) : 1;
                    ctkm a4 = ctkm.a();
                    ekwp ekwpVar2 = (ekwp) ekwt.a.v();
                    if (!ekwpVar2.b.L()) {
                        ekwpVar2.U();
                    }
                    ekwt ekwtVar4 = (ekwt) ekwpVar2.b;
                    ekwtVar4.c = 14;
                    ekwtVar4.b |= 1;
                    if (!ekwpVar2.b.L()) {
                        ekwpVar2.U();
                    }
                    ekwt ekwtVar5 = (ekwt) ekwpVar2.b;
                    ekwtVar5.e = a3 - 1;
                    ekwtVar5.b |= 4;
                    if (!ekwpVar2.b.L()) {
                        ekwpVar2.U();
                    }
                    ekwt ekwtVar6 = (ekwt) ekwpVar2.b;
                    ekwtVar6.d = 5;
                    ekwtVar6.b |= 2;
                    a4.c((ekwt) ekwpVar2.Q());
                }
            } catch (Throwable th) {
                Uri uri3 = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
                int a5 = uri3 != null ? cvev.a(uri3.getAuthority()) : 1;
                ctkm a6 = ctkm.a();
                ekwp ekwpVar3 = (ekwp) ekwt.a.v();
                if (!ekwpVar3.b.L()) {
                    ekwpVar3.U();
                }
                ekwt ekwtVar7 = (ekwt) ekwpVar3.b;
                ekwtVar7.c = 14;
                ekwtVar7.b |= 1;
                if (!ekwpVar3.b.L()) {
                    ekwpVar3.U();
                }
                ekwt ekwtVar8 = (ekwt) ekwpVar3.b;
                ekwtVar8.e = a5 - 1;
                ekwtVar8.b |= 4;
                if (!ekwpVar3.b.L()) {
                    ekwpVar3.U();
                }
                ekwt ekwtVar9 = (ekwt) ekwpVar3.b;
                ekwtVar9.d = 0;
                ekwtVar9.b |= 2;
                a6.c((ekwt) ekwpVar3.Q());
                throw th;
            }
        }
    }
}
