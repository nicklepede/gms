package com.google.android.gms.fido.fido2.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.fido.fido2.ui.PolluxChimeraActivity;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.arwm;
import defpackage.basc;
import defpackage.bcid;
import defpackage.bcif;
import defpackage.bcih;
import defpackage.bcii;
import defpackage.bcij;
import defpackage.bcnk;
import defpackage.bcnl;
import defpackage.bcno;
import defpackage.bcnp;
import defpackage.bp;
import defpackage.byhr;
import defpackage.dg;
import defpackage.iln;
import defpackage.qfn;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PolluxChimeraActivity extends qfn {
    public static final /* synthetic */ int o = 0;
    public String h;
    public ResultReceiver i;
    public bcnp j;
    public bcnl k;
    public boolean l;
    public int m;
    public int n;
    private Handler p;
    private BroadcastReceiver q;

    private final void k() {
        if (l()) {
            this.p.post(new Runnable() { // from class: bccf
                @Override // java.lang.Runnable
                public final void run() {
                    View findViewById = PolluxChimeraActivity.this.findViewById(R.id.fido_paask_vol_down_complete);
                    findViewById.setVisibility(0);
                    ((AnimatedVectorDrawable) ((ImageView) findViewById).getDrawable()).start();
                }
            });
            this.p.postDelayed(new Runnable() { // from class: bccg
                @Override // java.lang.Runnable
                public final void run() {
                    PolluxChimeraActivity polluxChimeraActivity = PolluxChimeraActivity.this;
                    polluxChimeraActivity.findViewById(R.id.fido_strongbox_prompt_content_layout).setVisibility(8);
                    View findViewById = polluxChimeraActivity.findViewById(R.id.fido_paask_checkmark);
                    findViewById.setVisibility(0);
                    ((AnimatedVectorDrawable) ((ImageView) findViewById).getDrawable()).start();
                }
            }, 1000L);
        }
        this.p.postDelayed(new Runnable() { // from class: bcch
            @Override // java.lang.Runnable
            public final void run() {
                PolluxChimeraActivity.this.b();
            }
        }, 2500L);
    }

    private final boolean l() {
        if (this.m != 2) {
            return false;
        }
        int i = this.n;
        if (i != 0) {
            return i == 1 || i == 2;
        }
        throw null;
    }

    public final void a() {
        this.n = 9;
        Intent putExtra = new Intent().setAction("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").setPackage("com.google.android.gms").putExtra("extra.screenId", 401).putExtra("extra.accountName", this.h).putExtra("extra.utmSource", "fido2");
        this.j.z(this.k, basc.TYPE_USER_VISITS_ACCOUNT_SETTINGS);
        startActivityForResult(putExtra, 0);
    }

    public final void b() {
        this.j.z(this.k, basc.TYPE_USER_APPROVES_AUTHENTICATION);
        this.n = 4;
        c(new bcih());
        Bundle bundle = new Bundle();
        bundle.putBoolean("UserApprovalExtra", true);
        this.i.send(-1, bundle);
    }

    public final void c(dg dgVar) {
        bp bpVar = new bp(gI());
        bpVar.F(R.id.pollux_fragment_container, dgVar);
        bpVar.b();
    }

    public final void j() {
        int i = this.m;
        if (i == 0) {
            this.j.z(this.k, basc.TYPE_USER_SHOWN_TURN_ON_BLUETOOTH_PROMPT);
            c(new bcii());
            return;
        }
        if (i == 1) {
            this.j.z(this.k, basc.TYPE_USER_SHOWN_TURN_ON_LOCATION_PROMPT);
            c(new bcij());
        } else {
            if (i != 2) {
                return;
            }
            this.j.z(this.k, basc.TYPE_USER_SHOWN_APPROVAL_PROMPT);
            boolean z = this.l;
            String str = this.h;
            bcid bcidVar = new bcid();
            bcidVar.a = z;
            bcidVar.b = str;
            c(bcidVar);
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("LoggerRequestIdExtra", -1);
        this.k = bcnl.b(bcnk.PAASK, intExtra <= 0 ? null : Integer.valueOf(intExtra));
        setTheme(R.style.fidoThemeDayNight);
        setContentView(R.layout.pollux_activity);
        setRequestedOrientation(1);
        this.p = new byhr(Looper.getMainLooper());
        this.h = getIntent().getStringExtra("AccountNameExtra");
        this.j = bcno.c(this);
        this.l = getIntent().getBooleanExtra("ShowStrongBoxUiExtra", false);
        this.m = getIntent().getIntExtra("CurrentPromptTypeExtra", -1);
        this.i = (ResultReceiver) getIntent().getParcelableExtra("ResultReceiverExtra");
        TracingBroadcastReceiver tracingBroadcastReceiver = new TracingBroadcastReceiver() { // from class: com.google.android.gms.fido.fido2.ui.PolluxChimeraActivity.1
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jz(Context context, Intent intent) {
                int i;
                arwm.b(intent.hasExtra("AuthenticationResultExtra") || intent.hasExtra("DismissActivityExtra") || intent.hasExtra("UpdatePromptExtra") || intent.hasExtra("ConnectClientResultExtra"));
                if (intent.hasExtra("DismissActivityExtra")) {
                    PolluxChimeraActivity.this.finish();
                    return;
                }
                if (intent.hasExtra("UpdatePromptExtra")) {
                    PolluxChimeraActivity polluxChimeraActivity = PolluxChimeraActivity.this;
                    int intExtra2 = intent.getIntExtra("UpdatePromptExtra", -1);
                    polluxChimeraActivity.m = intExtra2;
                    if (intExtra2 == 2) {
                        polluxChimeraActivity.h = intent.getStringExtra("AccountNameExtra");
                        polluxChimeraActivity.l = intent.getBooleanExtra("ShowStrongBoxUiExtra", false);
                    }
                    polluxChimeraActivity.j();
                    return;
                }
                if (intent.hasExtra("ConnectClientResultExtra")) {
                    if (intent.getBooleanExtra("ConnectClientResultExtra", false)) {
                        return;
                    }
                    PolluxChimeraActivity polluxChimeraActivity2 = PolluxChimeraActivity.this;
                    polluxChimeraActivity2.j.z(polluxChimeraActivity2.k, basc.TYPE_USER_SHOWN_NO_NEARBY_DEVICE_VIEW);
                    polluxChimeraActivity2.c(new bcif());
                    return;
                }
                final PolluxChimeraActivity polluxChimeraActivity3 = PolluxChimeraActivity.this;
                arwm.l(polluxChimeraActivity3.n == 4);
                if (intent.getBooleanExtra("AuthenticationResultExtra", false)) {
                    polluxChimeraActivity3.n = 5;
                    polluxChimeraActivity3.j.z(polluxChimeraActivity3.k, basc.TYPE_USER_SHOWN_AUTHENTICATION_SUCCEEDED_VIEW);
                    i = R.string.fido_paask_sign_in_toast;
                } else {
                    polluxChimeraActivity3.n = 6;
                    polluxChimeraActivity3.j.z(polluxChimeraActivity3.k, basc.TYPE_USER_SHOWN_AUTHENTICATION_FAILED_VIEW);
                    i = R.string.fido_paask_error_toast;
                }
                Toast.makeText(polluxChimeraActivity3, i, 0).show();
                byhr byhrVar = new byhr(Looper.getMainLooper());
                Objects.requireNonNull(polluxChimeraActivity3);
                byhrVar.postDelayed(new Runnable() { // from class: bcci
                    @Override // java.lang.Runnable
                    public final void run() {
                        PolluxChimeraActivity.this.finish();
                    }
                }, 1000L);
            }
        };
        this.q = tracingBroadcastReceiver;
        iln.b(this, tracingBroadcastReceiver, new IntentFilter("updatePolluxChimeraActivity"), 4);
        this.n = 1;
        j();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        super.onDestroy();
        this.n = 10;
        this.j.z(this.k, basc.TYPE_USER_DISMISSES_PROMPT);
        Bundle bundle = new Bundle();
        bundle.putBoolean("ActivityCompletionExtra", true);
        ResultReceiver resultReceiver = this.i;
        if (resultReceiver != null) {
            resultReceiver.send(-1, bundle);
        }
        BroadcastReceiver broadcastReceiver = this.q;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.l || i != 25) {
            return super.onKeyDown(i, keyEvent);
        }
        if (!l()) {
            return true;
        }
        k();
        return true;
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (!this.l || i != 25) {
            return super.onKeyLongPress(i, keyEvent);
        }
        k();
        return true;
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStart() {
        super.onStart();
    }
}
