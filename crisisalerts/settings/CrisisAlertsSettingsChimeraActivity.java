package com.google.android.gms.crisisalerts.settings;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.crisisalerts.settings.CrisisAlertsSettingsChimeraActivity;
import com.google.android.gms.crisisalerts.state.CrisisAlertsSystemStateChangeIntentOperation;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.asot;
import defpackage.asqh;
import defpackage.axda;
import defpackage.axdg;
import defpackage.axfv;
import defpackage.axfx;
import defpackage.axfz;
import defpackage.axgg;
import defpackage.axgx;
import defpackage.axhe;
import defpackage.ensj;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class CrisisAlertsSettingsChimeraActivity extends axgg {
    public static final asot j = axdg.a("StngAct");
    public static WeakReference k = new WeakReference(null);
    public axgx l;
    public axhe m;
    public axda n;
    public Executor o;
    public Context p;
    public View q;
    public TextView r;
    public TextView s;
    private TextView u;

    @Override // defpackage.asse
    protected final void k(boolean z) {
        ensj.t(this.l.c(z), new axfz(this, z), this.o);
    }

    public final void o() {
        ensj.t(this.m.c(), new axfv(this), this.o);
    }

    @Override // defpackage.axgg, defpackage.asse, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.p = this;
        if (asqh.g()) {
            getWindow().addSystemFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        }
        setTheme(R.style.CrisisAlertsAppDayNightTheme);
        setContentView(R.layout.crisis_alerts_settings_sdk21);
        m(true);
        TextView textView = (TextView) findViewById(R.id.learn_more);
        this.u = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: axfq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CrisisAlertsSettingsChimeraActivity.this.p.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("")));
            }
        });
        CrisisAlertsSystemStateChangeIntentOperation.b(new Runnable() { // from class: axfr
            @Override // java.lang.Runnable
            public final void run() {
                CrisisAlertsSettingsChimeraActivity crisisAlertsSettingsChimeraActivity = (CrisisAlertsSettingsChimeraActivity) CrisisAlertsSettingsChimeraActivity.k.get();
                if (crisisAlertsSettingsChimeraActivity != null) {
                    crisisAlertsSettingsChimeraActivity.o();
                }
            }
        });
        View findViewById = findViewById(R.id.crisis_alerts_system_state_warning_box);
        this.q = findViewById;
        this.r = (TextView) findViewById.findViewById(R.id.crisis_alerts_warning_message_text);
        this.s = (TextView) this.q.findViewById(R.id.crisis_alerts_warning_message_link);
        o();
        k = new WeakReference(this);
        this.n.g();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        ensj.t(this.l.b(), new axfx(this), this.o);
    }
}
