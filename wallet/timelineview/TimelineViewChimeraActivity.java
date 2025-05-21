package com.google.android.gms.wallet.timelineview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.R;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import defpackage.arwm;
import defpackage.diez;
import defpackage.difa;
import defpackage.ding;
import defpackage.djea;
import defpackage.djiq;
import defpackage.emen;
import defpackage.fsye;
import defpackage.fsyr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TimelineViewChimeraActivity extends diez {
    private byte[] h;
    private byte[] i;

    public static Intent Z(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        if (!fsyr.c()) {
            return djiq.h(context, intent, buyFlowConfig, 24);
        }
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.timelineview.TimeLineViewActivity");
        intent2.putExtras(intent.getExtras());
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.setAction("com.google.android.gms.wallet.firstparty.ACTION_TIME_LINE_VIEW");
        return intent2;
    }

    @Override // defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        boolean z = true;
        ding.C(this, l(), ding.j, true);
        q(bundle, fsye.a.a().k(), 13, emen.FLOW_TYPE_TIMELINE_VIEW);
        super.onCreate(bundle);
        difa.b(this);
        setContentView(R.layout.wallet_activity_common);
        Intent intent = getIntent();
        this.h = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        this.i = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        d((Toolbar) findViewById(R.id.toolbar));
        kJ().o(true);
        if (((djea) m()) == null) {
            byte[] bArr = this.h;
            byte[] bArr2 = this.i;
            BuyFlowConfig l = l();
            String str = this.a;
            LogContext logContext = this.b;
            boolean z2 = bArr != null && bArr.length > 0;
            boolean z3 = bArr2 != null && bArr2.length > 0;
            if (!z2 && !z3) {
                z = false;
            }
            arwm.c(z, "Parameters or initializeToken is required to launch TimelineView.");
            djea djeaVar = new djea();
            Bundle bZ = djea.bZ(l, str, logContext);
            if (bArr != null) {
                bZ.putByteArray("parameters", bArr);
            }
            if (bArr2 != null) {
                bZ.putByteArray("initializeToken", bArr2);
            }
            djeaVar.setArguments(bZ);
            B(djeaVar, R.id.fragment_holder);
        }
        ding.A(findViewById(R.id.wallet_root));
    }
}
