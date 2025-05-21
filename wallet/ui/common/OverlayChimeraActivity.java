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
import defpackage.diez;
import defpackage.dife;
import defpackage.dijq;
import defpackage.dikf;
import defpackage.dikm;
import defpackage.ding;
import defpackage.diqs;
import defpackage.dirh;
import defpackage.dirm;
import defpackage.djea;
import defpackage.djey;
import defpackage.efat;
import defpackage.efwo;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OverlayChimeraActivity extends diez {
    public static final /* synthetic */ int j = 0;
    int h;
    PageDetails i;
    private boolean k;

    @Override // defpackage.diez
    public final void H(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    @Override // defpackage.diez
    protected final boolean O() {
        return true;
    }

    @Override // defpackage.diez, defpackage.djew
    public final void X(int i) {
        Intent intent = new Intent();
        OverlayActivityActionEvent.a(getApplicationContext(), this.a, i, 4, -1);
        H(0, intent);
    }

    @Override // defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        djey difeVar;
        Intent intent = getIntent();
        this.i = (PageDetails) intent.getParcelableExtra("pageDetails");
        this.h = intent.getIntExtra("overlayType", 0);
        this.a = intent.getStringExtra("sessionId");
        if (bundle == null) {
            this.b = (LogContext) intent.getParcelableExtra("logContext");
        } else {
            this.b = (LogContext) bundle.getParcelable("logContext");
        }
        Account kW = kW();
        efat.m(new dikf(getApplicationContext(), efwo.Y(this), kW != null ? kW.name : null), this.b.a());
        ((diez) this).e = intent.getByteArrayExtra("ephemeralPrivateKey");
        this.f = intent.getByteArrayExtra("cReqSessionKey");
        boolean z = intent.getIntExtra("overlayStyle", 1) == 2;
        this.k = z;
        ding.C(this, l(), z ? ding.f : ding.e, false);
        super.onCreate(bundle);
        setContentView(R.layout.wallet_activity_overlay);
        d((Toolbar) findViewById(R.id.overlay_toolbar));
        kJ().o(!this.k);
        ((diez) this).d = (ProgressSpinnerView) findViewById(R.id.progress_spinner_container);
        if (m() == null) {
            BuyFlowConfig l = l();
            switch (this.h) {
                case 1:
                    String str = this.a;
                    PageDetails pageDetails = this.i;
                    LogContext logContext = this.b;
                    difeVar = new dife();
                    difeVar.setArguments(djey.bY(l, str, pageDetails, logContext));
                    break;
                case 2:
                    String str2 = this.a;
                    PageDetails pageDetails2 = this.i;
                    LogContext logContext2 = this.b;
                    dirm dirmVar = new dirm();
                    Bundle bY = djey.bY(l, str2, pageDetails2, logContext2);
                    bY.putBoolean("isDialog", false);
                    bY.putBoolean("showCancelButton", false);
                    dirmVar.setArguments(bY);
                    difeVar = dirmVar;
                    break;
                case 3:
                    String str3 = this.a;
                    PageDetails pageDetails3 = this.i;
                    LogContext logContext3 = this.b;
                    difeVar = new diqs();
                    difeVar.setArguments(djey.bY(l, str3, pageDetails3, logContext3));
                    break;
                case 4:
                    PageDetails pageDetails4 = this.i;
                    String str4 = this.a;
                    LogContext logContext4 = this.b;
                    difeVar = new dijq();
                    difeVar.setArguments(dijq.bY(l, str4, pageDetails4, logContext4));
                    break;
                case 5:
                    PageDetails pageDetails5 = this.i;
                    String str5 = this.a;
                    LogContext logContext5 = this.b;
                    difeVar = new dirh();
                    difeVar.setArguments(dirh.bY(l, str5, pageDetails5, logContext5));
                    break;
                case 6:
                    PageDetails pageDetails6 = this.i;
                    String str6 = this.a;
                    LogContext logContext6 = this.b;
                    difeVar = new djea();
                    difeVar.setArguments(djea.bY(l, str6, pageDetails6, logContext6));
                    break;
                default:
                    throw new IllegalArgumentException(String.format(Locale.US, "Unsupported overlay type: %d", Integer.valueOf(this.h)));
            }
            B(difeVar, R.id.overlay_container);
        }
        ding.A(findViewById(R.id.wallet_root));
    }

    @Override // defpackage.diez, defpackage.djew
    public final void v(WalletExitResult walletExitResult) {
        Intent intent = new Intent();
        if (dikm.a(l().c)) {
            walletExitResult.a().b(intent);
        }
        OverlayActivityActionEvent.a(getApplicationContext(), this.a, walletExitResult.c(), 4, -1);
        H(0, intent);
    }

    @Override // defpackage.diez, defpackage.djew
    public final void w(int i) {
        Intent intent = new Intent();
        OverlayActivityActionEvent.a(getApplicationContext(), this.a, 9, 5, i);
        intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", i);
        H(1, intent);
    }

    @Override // defpackage.diez, defpackage.djew
    public final void x(WalletExitResult walletExitResult) {
        Intent intent = new Intent();
        OverlayActivityActionEvent.a(getApplicationContext(), this.a, 9, 5, walletExitResult.c);
        intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", walletExitResult);
        if (dikm.a(l().c)) {
            walletExitResult.a().b(intent);
        }
        H(1, intent);
    }

    @Override // defpackage.diez, defpackage.djew
    public final void z(Parcelable parcelable, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("pageDetails", m().aw);
        OverlayActivityActionEvent.a(getApplicationContext(), this.a, 2, 2, -1);
        H(-1, intent);
    }
}
