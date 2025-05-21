package com.google.android.gms.phonesky.recovery;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.assw;
import defpackage.cwhj;
import defpackage.cwhk;
import defpackage.cwhl;
import defpackage.cwhs;
import defpackage.eiig;
import defpackage.frmq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class NotificationClickedIntentOperation extends IntentOperation {
    private cwhk a;
    private cwhl b;
    private cwhs c;

    private final void a(int i) {
        cwhl cwhlVar = this.b;
        if (cwhlVar != null) {
            cwhlVar.b(3, i);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        cwhl cwhlVar = new cwhl(this);
        cwhk cwhkVar = new cwhk(new assw(this));
        cwhs cwhsVar = new cwhs(this, cwhlVar);
        this.a = cwhkVar;
        this.b = cwhlVar;
        this.c = cwhsVar;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !"com.google.android.gms.phonesky.recovery.CLICK".equals(intent.getAction())) {
            return;
        }
        if (this.c == null || this.a == null) {
            cwhj.b("Invalid state", new Object[0]);
            a(3);
            return;
        }
        cwhj.a("Recovery notification clicked", new Object[0]);
        a(2);
        cwhs cwhsVar = this.c;
        eiig.x(cwhsVar);
        cwhsVar.b();
        cwhk cwhkVar = this.a;
        eiig.x(cwhkVar);
        if (cwhkVar.a(frmq.e())) {
            Intent intent2 = new Intent("android.intent.action.UNINSTALL_PACKAGE", Uri.parse("package:com.android.vending"));
            intent2.setFlags(268468224);
            startActivity(intent2);
        }
    }
}
