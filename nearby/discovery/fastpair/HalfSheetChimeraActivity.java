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
import defpackage.aupv;
import defpackage.bp;
import defpackage.chke;
import defpackage.ciqy;
import defpackage.ciuh;
import defpackage.cjot;
import defpackage.cjul;
import defpackage.cjvu;
import defpackage.cjvw;
import defpackage.cjwd;
import defpackage.cjwf;
import defpackage.ekti;
import defpackage.ekvk;
import defpackage.ekvl;
import defpackage.eluo;
import defpackage.favd;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.ftes;
import defpackage.ftey;
import defpackage.iuz;
import defpackage.ivv;
import defpackage.iwe;
import defpackage.iwv;
import defpackage.rxx;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class HalfSheetChimeraActivity extends rxx {
    public cjul j;
    public cjot k;
    private ScheduledExecutorService l;
    private ScheduledFuture m;
    private boolean n = false;
    private boolean o = false;

    private static cjvw A(Intent intent) {
        return cjwf.c(intent.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_PROVIDER_TYPE"));
    }

    private final void B(Intent intent) {
        cjot cjotVar = this.k;
        if (cjotVar != null) {
            Intent putExtra = intent.putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_E2E_TRIGGER_ID", cjotVar.iD());
            cjot cjotVar2 = this.k;
            ekvl.y(cjotVar2);
            putExtra.putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_FEATURE_TYPE", cjotVar2.iC().name());
        }
    }

    public static Intent a(Context context, cjul cjulVar, favd favdVar) {
        return new Intent().setClassName(context, "com.google.android.gms.nearby.discovery.fastpair.HalfSheetActivity").putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_HALF_SHEET_TYPE", "SPOT").putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET", cjulVar.r()).putExtra("com.google.android.gms.nearby.discovery.EXTRA_SPOT_FRAGMENT_STATE", favdVar.F);
    }

    public static cjul l(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.nearby.discovery.HALF_SHEET");
        if (byteArrayExtra == null) {
            return null;
        }
        try {
            fgri y = fgri.y(cjul.b, byteArrayExtra, 0, byteArrayExtra.length, fgqp.a());
            fgri.M(y);
            return (cjul) y;
        } catch (fgsd e) {
            ((eluo) ciqy.a.g().s(e)).x("HalfSheetActivity: error happens when pass info to half sheet");
            return null;
        }
    }

    public static String m(Intent intent) {
        return intent.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_HALF_SHEET_TYPE");
    }

    private static cjvu z(Intent intent) {
        return cjwd.a(intent.getStringExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_FEATURE_TYPE"));
    }

    public final Bundle k(byte[] bArr, String str) {
        cjvw A = A(getIntent());
        cjvu z = z(getIntent());
        String b = ekvk.b(m(getIntent()));
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_PROVIDER_TYPE", A.name());
        bundle.putString("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_FEATURE_TYPE", z.name());
        bundle.putString("com.google.android.gms.nearby.discovery.fastpair.EXTRA_HALF_SHEET_TYPE", b);
        bundle.putByteArray("com.google.android.gms.nearby.discovery.fastpair.EXTRA_ACCOUNT_KEY", bArr);
        if (!ekvk.c(str)) {
            bundle.putString("com.google.android.gms.nearby.discovery.fastpair.BLUETOOTH_MAC_ADDRESS", str);
        }
        return bundle;
    }

    public final void n() {
        Intent putExtra = new Intent("com.google.android.gms.nearby.ACTION_HALF_SHEET_FOREGROUND_STATE").putExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_FOREGROUND", false);
        B(putExtra);
        chke.d(this, putExtra);
        finish();
    }

    public final void o() {
        TextView textView = (TextView) findViewById(R.id.toolbar_title);
        textView.setTypeface(textView.getTypeface(), 1);
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        super.onBackPressed();
        u(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0424  */
    /* JADX WARN: Type inference failed for: r4v26, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.discovery.fastpair.HalfSheetChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        ScheduledFuture scheduledFuture = this.m;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        super.onDestroy();
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String m = m(getIntent());
        if (m != null && m.equals("DEVICE_PAIRING")) {
            cjul l = l(intent);
            cjul cjulVar = this.j;
            if (l == null || cjulVar == null || l.l.equals(cjulVar.l) || !l.e.equals(cjulVar.e)) {
                return;
            }
            ciqy.a.d().x("HalfSheetActivity: possible factory reset happens");
            n();
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onResume() {
        super.onResume();
        this.n = false;
        this.o = false;
        ciqy.a.f().x("HalfSheetActivity: onResume, set userIsLeaving and setHalfSheetShouldResumeAfterLeaving to false.");
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        cjot cjotVar = this.k;
        if (cjotVar != null) {
            cjotVar.onSaveInstanceState(bundle);
        }
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        chke.d(this, new Intent("com.google.android.gms.nearby.ACTION_HALF_SHEET_FOREGROUND_STATE").putExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_FOREGROUND", true));
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_PENDING_INTENT");
        if (pendingIntent != null) {
            ciqy.a.d().x("HalfSheetActivity: sending half sheet pending intent.");
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e) {
                ((eluo) ciqy.a.e().s(e)).B("Error sending half sheet pending intent: %s", pendingIntent);
            }
        }
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onStop() {
        if (this.n && !this.o && this.m == null) {
            ciqy.a.f().x("HalfSheetActivity: onStop sendHalfSheetCancelBroadcast.");
            u(false);
            if (ftey.ax()) {
                finish();
            }
        }
        super.onStop();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        this.n = true;
        ciqy.a.f().x("HalfSheetActivity: onUserLeaveHint, set userIsLeaving to true.");
    }

    public final void p() {
        if (ftey.a.lK().cb()) {
            iwv.a(getWindow(), false);
            setTheme(R.style.HalfSheetEdgeToEdgeViewStyle);
            View decorView = getWindow().getDecorView();
            iuz iuzVar = new iuz() { // from class: ciuf
                @Override // defpackage.iuz
                public final ixt eB(View view, ixt ixtVar) {
                    int i = ixtVar.f(2).e;
                    HalfSheetChimeraActivity halfSheetChimeraActivity = HalfSheetChimeraActivity.this;
                    View findViewById = (citu.G(halfSheetChimeraActivity.j) && halfSheetChimeraActivity.getResources().getBoolean(R.bool.qs_force_transparent_navigation_bar)) ? halfSheetChimeraActivity.findViewById(R.id.background) : halfSheetChimeraActivity.findViewById(R.id.card);
                    findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), i);
                    return ixt.a;
                }
            };
            int[] iArr = iwe.a;
            ivv.k(decorView, iuzVar);
        }
    }

    public final void q() {
        u(false);
        finish();
    }

    public final void r() {
        v(true);
        findViewById(R.id.card).setOnClickListener(new View.OnClickListener() { // from class: ciug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ciqy.a.f().x("HalfSheetActivity: card view is clicked noop");
            }
        });
        findViewById(R.id.card).setAccessibilityDelegate(new ciuh(this));
        TextView textView = (TextView) findViewById(R.id.toolbar_title);
        if (textView == null) {
            ciqy.a.g().x("Unable to configure title TextView.");
        } else {
            textView.setMaxLines(3);
        }
    }

    public final void s() {
        if (this.k == null) {
            return;
        }
        bp bpVar = new bp(getSupportFragmentManager());
        cjot cjotVar = this.k;
        ekvl.y(cjotVar);
        bpVar.F(R.id.fragment_container, cjotVar);
        bpVar.a();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        ((TextView) findViewById(R.id.toolbar_title)).setText(charSequence);
    }

    public final void t() {
        if (this.j != null) {
            chke.d(this, new Intent("com.google.android.gms.nearby.ACTION_FAST_PAIR_BAN_STATE_RESET").putExtra("com.google.android.gms.nearby.discovery.fastpair.halfsheet:MODEL_ID", ekti.c(this.j.e)));
        }
    }

    public final void u(boolean z) {
        Intent putExtra = new Intent("com.google.android.gms.nearby.ACTION_HALF_SHEET_FOREGROUND_STATE").putExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_FOREGROUND", false);
        cjot cjotVar = this.k;
        if (cjotVar != null) {
            Intent putExtra2 = putExtra.putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_E2E_TRIGGER_ID", cjotVar.iD());
            cjot cjotVar2 = this.k;
            ekvl.y(cjotVar2);
            putExtra2.putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_FEATURE_TYPE", cjotVar2.iC().name());
        }
        chke.d(this, putExtra);
        if (this.j != null) {
            Intent putExtra3 = new Intent("com.google.android.gms.nearby.ACTION_FAST_PAIR_HALF_SHEET_CANCEL").putExtra("com.google.android.gms.nearby.discovery.fastpair.halfsheet:MODEL_ID", ekti.c(this.j.e)).putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_HALF_SHEET_TYPE", getIntent().getStringExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_HALF_SHEET_TYPE")).putExtra("com.google.android.gms.nearby.discovery.EXTRA_HALF_SHEET_SHOULD_FORCE_BLOCK", z).putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_SUBSEQUENT_PAIR", getIntent().getBooleanExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_SUBSEQUENT_PAIR", false)).putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE", getIntent().getBooleanExtra("com.google.android.gms.nearby.discovery.HALF_SHEET_IS_RETROACTIVE", false));
            cjul cjulVar = this.j;
            ekvl.y(cjulVar);
            Intent putExtra4 = putExtra3.putExtra("com.google.android.gms.nearby.discovery.EXTRA_MAC_ADDRESS", cjulVar.l);
            cjot cjotVar3 = this.k;
            if (cjotVar3 != null) {
                Intent putExtra5 = putExtra4.putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_E2E_TRIGGER_ID", cjotVar3.iD());
                cjot cjotVar4 = this.k;
                ekvl.y(cjotVar4);
                putExtra5.putExtra("com.google.android.gms.nearby.discovery.fastpair.EXTRA_SCALABLE_SEEKER_FEATURE_TYPE", cjotVar4.iC().name());
            }
            chke.d(this, putExtra4);
        }
    }

    public final void v(boolean z) {
        ciqy.a.d().B("HalfSheetActivity, enable dismiss by clicking background:%b", Boolean.valueOf(z));
        View findViewById = findViewById(R.id.background);
        if (z) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: ciue
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
        ciqy.a.d().x("HalfSheetActivity: setHalfSheetShouldResumeAfterLeaving, set halfSheetShouldResumeAfterLeaving to true.");
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
        chke.d(this, intent2);
        if (this.l == null) {
            this.l = new aupv(1, 9);
        }
        this.m = ((aupv) this.l).schedule(new Runnable() { // from class: ciud
            @Override // java.lang.Runnable
            public final void run() {
                ciqy.a.d().x("HalfSheetActivity: dismiss FP halfsheet");
                HalfSheetChimeraActivity.this.n();
            }
        }, ftes.a.lK().aW(), TimeUnit.MILLISECONDS);
    }
}
