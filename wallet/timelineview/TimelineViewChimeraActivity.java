package com.google.android.gms.wallet.timelineview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.R;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import defpackage.atzb;
import defpackage.dkqk;
import defpackage.dkql;
import defpackage.dkyr;
import defpackage.dlpt;
import defpackage.dluj;
import defpackage.eosb;
import defpackage.fvty;
import defpackage.fvul;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TimelineViewChimeraActivity extends dkqk {
    private byte[] h;
    private byte[] i;

    public static Intent Z(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        if (!fvul.c()) {
            return dluj.h(context, intent, buyFlowConfig, 24);
        }
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.timelineview.TimeLineViewActivity");
        intent2.putExtras(intent.getExtras());
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.setAction("com.google.android.gms.wallet.firstparty.ACTION_TIME_LINE_VIEW");
        return intent2;
    }

    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        boolean z = true;
        dkyr.C(this, l(), dkyr.j, true);
        q(bundle, fvty.a.lK().k(), 13, eosb.FLOW_TYPE_TIMELINE_VIEW);
        super.onCreate(bundle);
        dkql.b(this);
        setContentView(R.layout.wallet_activity_common);
        Intent intent = getIntent();
        this.h = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        this.i = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        d((Toolbar) findViewById(R.id.toolbar));
        kY().o(true);
        if (((dlpt) m()) == null) {
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
            atzb.c(z, "Parameters or initializeToken is required to launch TimelineView.");
            dlpt dlptVar = new dlpt();
            Bundle bY = dlpt.bY(l, str, logContext);
            if (bArr != null) {
                bY.putByteArray("parameters", bArr);
            }
            if (bArr2 != null) {
                bY.putByteArray("initializeToken", bArr2);
            }
            dlptVar.setArguments(bY);
            B(dlptVar, R.id.fragment_holder);
        }
        dkyr.A(findViewById(R.id.wallet_root));
    }
}
