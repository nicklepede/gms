package com.google.android.gms.wallet.ui.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.R;
import com.google.android.gms.wallet.analytics.events.OverlayActivityActionEvent;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import defpackage.dkqk;
import defpackage.dkqp;
import defpackage.dkva;
import defpackage.dkvq;
import defpackage.dkvx;
import defpackage.dkyr;
import defpackage.dlcd;
import defpackage.dlcs;
import defpackage.dlcx;
import defpackage.dlpt;
import defpackage.dlqr;
import defpackage.ehnw;
import defpackage.eijr;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OverlayChimeraActivity extends dkqk {
    public static final /* synthetic */ int j = 0;
    int h;
    PageDetails i;
    private boolean k;

    @Override // defpackage.dkqk
    public final void H(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    @Override // defpackage.dkqk
    protected final boolean O() {
        return true;
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final void X(int i) {
        Intent intent = new Intent();
        OverlayActivityActionEvent.a(getApplicationContext(), this.a, i, 4, -1);
        H(0, intent);
    }

    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        dlqr dkqpVar;
        Intent intent = getIntent();
        this.i = (PageDetails) intent.getParcelableExtra("pageDetails");
        this.h = intent.getIntExtra("overlayType", 0);
        this.a = intent.getStringExtra("sessionId");
        if (bundle == null) {
            this.b = (LogContext) intent.getParcelableExtra("logContext");
        } else {
            this.b = (LogContext) bundle.getParcelable("logContext");
        }
        Account ll = ll();
        ehnw.m(new dkvq(getApplicationContext(), eijr.Y(this), ll != null ? ll.name : null), this.b.a());
        ((dkqk) this).e = intent.getByteArrayExtra("ephemeralPrivateKey");
        this.f = intent.getByteArrayExtra("cReqSessionKey");
        boolean z = intent.getIntExtra("overlayStyle", 1) == 2;
        this.k = z;
        dkyr.C(this, l(), z ? dkyr.f : dkyr.e, false);
        super.onCreate(bundle);
        setContentView(R.layout.wallet_activity_overlay);
        d((Toolbar) findViewById(R.id.overlay_toolbar));
        kY().o(!this.k);
        ((dkqk) this).d = (ProgressSpinnerView) findViewById(R.id.progress_spinner_container);
        if (m() == null) {
            BuyFlowConfig l = l();
            switch (this.h) {
                case 1:
                    String str = this.a;
                    PageDetails pageDetails = this.i;
                    LogContext logContext = this.b;
                    dkqpVar = new dkqp();
                    dkqpVar.setArguments(dlqr.bX(l, str, pageDetails, logContext));
                    break;
                case 2:
                    String str2 = this.a;
                    PageDetails pageDetails2 = this.i;
                    LogContext logContext2 = this.b;
                    dlcx dlcxVar = new dlcx();
                    Bundle bX = dlqr.bX(l, str2, pageDetails2, logContext2);
                    bX.putBoolean("isDialog", false);
                    bX.putBoolean("showCancelButton", false);
                    dlcxVar.setArguments(bX);
                    dkqpVar = dlcxVar;
                    break;
                case 3:
                    String str3 = this.a;
                    PageDetails pageDetails3 = this.i;
                    LogContext logContext3 = this.b;
                    dkqpVar = new dlcd();
                    dkqpVar.setArguments(dlqr.bX(l, str3, pageDetails3, logContext3));
                    break;
                case 4:
                    PageDetails pageDetails4 = this.i;
                    String str4 = this.a;
                    LogContext logContext4 = this.b;
                    dkqpVar = new dkva();
                    dkqpVar.setArguments(dkva.bX(l, str4, pageDetails4, logContext4));
                    break;
                case 5:
                    PageDetails pageDetails5 = this.i;
                    String str5 = this.a;
                    LogContext logContext5 = this.b;
                    dkqpVar = new dlcs();
                    dkqpVar.setArguments(dlcs.bX(l, str5, pageDetails5, logContext5));
                    break;
                case 6:
                    PageDetails pageDetails6 = this.i;
                    String str6 = this.a;
                    LogContext logContext6 = this.b;
                    dkqpVar = new dlpt();
                    dkqpVar.setArguments(dlpt.bX(l, str6, pageDetails6, logContext6));
                    break;
                default:
                    throw new IllegalArgumentException(String.format(Locale.US, "Unsupported overlay type: %d", Integer.valueOf(this.h)));
            }
            B(dkqpVar, R.id.overlay_container);
        }
        dkyr.A(findViewById(R.id.wallet_root));
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final void v(WalletExitResult walletExitResult) {
        Intent intent = new Intent();
        if (dkvx.a(l().c)) {
            walletExitResult.a().b(intent);
        }
        OverlayActivityActionEvent.a(getApplicationContext(), this.a, walletExitResult.c(), 4, -1);
        H(0, intent);
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final void w(int i) {
        Intent intent = new Intent();
        OverlayActivityActionEvent.a(getApplicationContext(), this.a, 9, 5, i);
        intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
        H(1, intent);
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final void x(WalletExitResult walletExitResult) {
        Intent intent = new Intent();
        OverlayActivityActionEvent.a(getApplicationContext(), this.a, 9, 5, walletExitResult.c);
        intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", walletExitResult);
        if (dkvx.a(l().c)) {
            walletExitResult.a().b(intent);
        }
        H(1, intent);
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final void z(Parcelable parcelable, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("pageDetails", m().aw);
        OverlayActivityActionEvent.a(getApplicationContext(), this.a, 2, 2, -1);
        H(-1, intent);
    }
}
