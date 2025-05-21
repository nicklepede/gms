package com.google.android.gms.nearby.discovery.fastpair;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.nearby.discovery.fastpair.HalfSheetChimeraActivity;
import defpackage.asmb;
import defpackage.bp;
import defpackage.cfcs;
import defpackage.cgiv;
import defpackage.cgme;
import defpackage.chgs;
import defpackage.chmk;
import defpackage.chnt;
import defpackage.chnv;
import defpackage.choc;
import defpackage.choe;
import defpackage.eigd;
import defpackage.eiif;
import defpackage.eiig;
import defpackage.ejhf;
import defpackage.eygr;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.fqkx;
import defpackage.fqld;
import defpackage.itj;
import defpackage.iuf;
import defpackage.iuo;
import defpackage.ivf;
import defpackage.qet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class HalfSheetChimeraActivity extends qet {
    public chmk j;
    public chgs k;
    private ScheduledExecutorService l;
    private ScheduledFuture m;
    private boolean n = false;
    private boolean o = false;

    private static chnv A(Intent intent) {
        return choe.c(intent.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_PROVIDER_TYPE"));
    }

    private final void B(Intent intent) {
        chgs chgsVar = this.k;
        if (chgsVar != null) {
            Intent putExtra = intent.putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_E2E_TRIGGER_ID", chgsVar.io());
            chgs chgsVar2 = this.k;
            eiig.x(chgsVar2);
            putExtra.putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_FEATURE_TYPE", chgsVar2.in().name());
        }
    }

    public static Intent a(Context context, chmk chmkVar, eygr eygrVar) {
        return new Intent().setClassName(context, "com.google.android.gms.nearby.discovery.fastpair.HalfSheetActivity").putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_HALF_SHEET_TYPE", "SPOT").putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET", chmkVar.r()).putExtra("com.google.android.gms.nearby.discovery.EXTRA_SPOT_FRAGMENT_STATE", eygrVar.F);
    }

    public static chmk l(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.nearby.discovery.HALF_SHEET");
        if (byteArrayExtra == null) {
            return null;
        }
        try {
            fecp y = fecp.y(chmk.b, byteArrayExtra, 0, byteArrayExtra.length, febw.a());
            fecp.M(y);
            return (chmk) y;
        } catch (fedk e) {
            ((ejhf) cgiv.a.g().s(e)).x("HalfSheetActivity: error happens when pass info to half sheet");
            return null;
        }
    }

    public static String m(Intent intent) {
        return intent.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_HALF_SHEET_TYPE");
    }

    private static chnt z(Intent intent) {
        return choc.a(intent.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_FEATURE_TYPE"));
    }

    public final Bundle k(byte[] bArr, String str) {
        chnv A = A(getIntent());
        chnt z = z(getIntent());
        String b = eiif.b(m(getIntent()));
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_PROVIDER_TYPE", A.name());
        bundle.putString("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_FEATURE_TYPE", z.name());
        bundle.putString("com.google.android.gms.nearby.discovery.fastpair.EXTRA_HALF_SHEET_TYPE", b);
        bundle.putByteArray("com.google.android.gms.nearby.discovery.fastpair.EXTRA_ACCOUNT_KEY", bArr);
        if (!eiif.c(str)) {
            bundle.putString("com.google.android.gms.nearby.discovery.fastpair.BLUETOOTH_MAC_ADDRESS", str);
        }
        return bundle;
    }

    public final void n() {
        Intent putExtra = new Intent("com.google.android.gms.nearby.ACTION_HALF_SHEET_FOREGROUND_STATE").putExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_FOREGROUND", false);
        B(putExtra);
        cfcs.d(this, putExtra);
        finish();
    }

    public final void o() {
        TextView textView = (TextView) findViewById(R.id.toolbar_title);
        textView.setTypeface(textView.getTypeface(), 1);
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        super.onBackPressed();
        u(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:111:0x041c  */
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.discovery.fastpair.HalfSheetChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        ScheduledFuture scheduledFuture = this.m;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        super.onDestroy();
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String m = m(getIntent());
        if (m != null && m.equals("DEVICE_PAIRING")) {
            chmk l = l(intent);
            chmk chmkVar = this.j;
            if (l == null || chmkVar == null || l.l.equals(chmkVar.l) || !l.e.equals(chmkVar.e)) {
                return;
            }
            cgiv.a.d().x("HalfSheetActivity: possible factory reset happens");
            n();
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onResume() {
        super.onResume();
        this.n = false;
        this.o = false;
        cgiv.a.f().x("HalfSheetActivity: onResume, set userIsLeaving and setHalfSheetShouldResumeAfterLeaving to false.");
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        chgs chgsVar = this.k;
        if (chgsVar != null) {
            chgsVar.onSaveInstanceState(bundle);
        }
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        cfcs.d(this, new Intent("com.google.android.gms.nearby.ACTION_HALF_SHEET_FOREGROUND_STATE").putExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_FOREGROUND", true));
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_PENDING_INTENT");
        if (pendingIntent != null) {
            cgiv.a.d().x("HalfSheetActivity: sending half sheet pending intent.");
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e) {
                ((ejhf) cgiv.a.e().s(e)).B("Error sending half sheet pending intent: %s", pendingIntent);
            }
        }
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStop() {
        if (this.n && !this.o && this.m == null) {
            cgiv.a.f().x("HalfSheetActivity: onStop sendHalfSheetCancelBroadcast.");
            u(false);
            if (fqld.aw()) {
                finish();
            }
        }
        super.onStop();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        this.n = true;
        cgiv.a.f().x("HalfSheetActivity: onUserLeaveHint, set userIsLeaving to true.");
    }

    public final void p() {
        if (fqld.a.a().bZ()) {
            ivf.a(getWindow(), false);
            setTheme(R.style.HalfSheetEdgeToEdgeViewStyle);
            View decorView = getWindow().getDecorView();
            itj itjVar = new itj() { // from class: cgmc
                @Override // defpackage.itj
                public final iwd eB(View view, iwd iwdVar) {
                    int i = iwdVar.f(2).e;
                    HalfSheetChimeraActivity halfSheetChimeraActivity = HalfSheetChimeraActivity.this;
                    View findViewById = (cglr.G(halfSheetChimeraActivity.j) && halfSheetChimeraActivity.getResources().getBoolean(R.bool.qs_force_transparent_navigation_bar)) ? halfSheetChimeraActivity.findViewById(R.id.background) : halfSheetChimeraActivity.findViewById(R.id.card);
                    findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), i);
                    return iwd.a;
                }
            };
            int[] iArr = iuo.a;
            iuf.k(decorView, itjVar);
        }
    }

    public final void q() {
        u(false);
        finish();
    }

    public final void r() {
        v(true);
        findViewById(R.id.card).setOnClickListener(new View.OnClickListener() { // from class: cgmd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cgiv.a.f().x("HalfSheetActivity: card view is clicked noop");
            }
        });
        findViewById(R.id.card).setAccessibilityDelegate(new cgme(this));
        TextView textView = (TextView) findViewById(R.id.toolbar_title);
        if (textView == null) {
            cgiv.a.g().x("Unable to configure title TextView.");
        } else {
            textView.setMaxLines(3);
        }
    }

    public final void s() {
        if (this.k == null) {
            return;
        }
        bp bpVar = new bp(getSupportFragmentManager());
        chgs chgsVar = this.k;
        eiig.x(chgsVar);
        bpVar.F(R.id.fragment_container, chgsVar);
        bpVar.a();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        ((TextView) findViewById(R.id.toolbar_title)).setText(charSequence);
    }

    public final void t() {
        if (this.j != null) {
            cfcs.d(this, new Intent("com.google.android.gms.nearby.ACTION_FAST_PAIR_BAN_STATE_RESET").putExtra("com.google.android.gms.nearby.discovery.fastpair.halfsheet:MODEL_ID", eigd.c(this.j.e)));
        }
    }

    public final void u(boolean z) {
        Intent putExtra = new Intent("com.google.android.gms.nearby.ACTION_HALF_SHEET_FOREGROUND_STATE").putExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_FOREGROUND", false);
        chgs chgsVar = this.k;
        if (chgsVar != null) {
            Intent putExtra2 = putExtra.putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_E2E_TRIGGER_ID", chgsVar.io());
            chgs chgsVar2 = this.k;
            eiig.x(chgsVar2);
            putExtra2.putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_FEATURE_TYPE", chgsVar2.in().name());
        }
        cfcs.d(this, putExtra);
        if (this.j != null) {
            Intent putExtra3 = new Intent("com.google.android.gms.nearby.ACTION_FAST_PAIR_HALF_SHEET_CANCEL").putExtra("com.google.android.gms.nearby.discovery.fastpair.halfsheet:MODEL_ID", eigd.c(this.j.e)).putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_HALF_SHEET_TYPE", getIntent().getStringExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_HALF_SHEET_TYPE")).putExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_SHOULD_FORCE_BLOCK", z).putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_SUBSEQUENT_PAIR", getIntent().getBooleanExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_SUBSEQUENT_PAIR", false)).putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE", getIntent().getBooleanExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE", false));
            chmk chmkVar = this.j;
            eiig.x(chmkVar);
            Intent putExtra4 = putExtra3.putExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS", chmkVar.l);
            chgs chgsVar3 = this.k;
            if (chgsVar3 != null) {
                Intent putExtra5 = putExtra4.putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_E2E_TRIGGER_ID", chgsVar3.io());
                chgs chgsVar4 = this.k;
                eiig.x(chgsVar4);
                putExtra5.putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_FEATURE_TYPE", chgsVar4.in().name());
            }
            cfcs.d(this, putExtra4);
        }
    }

    public final void v(boolean z) {
        cgiv.a.d().B("HalfSheetActivity, enable dismiss by clicking background:%b", Boolean.valueOf(z));
        View findViewById = findViewById(R.id.background);
        if (z) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: cgmb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HalfSheetChimeraActivity.this.q();
                }
            });
        } else {
            findViewById.setOnClickListener(null);
        }
        findViewById.setClickable(z);
    }

    public final void w() {
        this.o = true;
        cgiv.a.d().x("HalfSheetActivity: setHalfSheetShouldResumeAfterLeaving, set halfSheetShouldResumeAfterLeaving to true.");
    }

    public final void x(int i) {
        ImageView imageView = (ImageView) findViewById(R.id.toolbar_image);
        imageView.setVisibility(0);
        imageView.setImageResource(i);
    }

    public final void y(Intent intent, String str) {
        startActivity(intent);
        Intent intent2 = new Intent("com.google.android.gms.nearby.ACTION_SPOT_PROVISIONING_STARTED");
        intent2.putExtra("com.google.android.gms.nearby.discovery.fastpair.halfsheet:MODEL_ID", str);
        B(intent2);
        cfcs.d(this, intent2);
        if (this.l == null) {
            this.l = new asmb(1, 9);
        }
        this.m = ((asmb) this.l).schedule(new Runnable() { // from class: cgma
            @Override // java.lang.Runnable
            public final void run() {
                cgiv.a.d().x("HalfSheetActivity: dismiss FP halfsheet");
                HalfSheetChimeraActivity.this.n();
            }
        }, fqkx.a.a().aW(), TimeUnit.MILLISECONDS);
    }
}
