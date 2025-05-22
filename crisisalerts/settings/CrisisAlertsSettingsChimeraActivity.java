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
import defpackage.ausn;
import defpackage.auub;
import defpackage.azha;
import defpackage.azhg;
import defpackage.azjv;
import defpackage.azjx;
import defpackage.azjz;
import defpackage.azkg;
import defpackage.azkx;
import defpackage.azle;
import defpackage.eqgc;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class CrisisAlertsSettingsChimeraActivity extends azkg {
    public static final ausn j = azhg.a("StngAct");
    public static WeakReference k = new WeakReference(null);
    public azkx l;
    public azle m;
    public azha n;
    public Executor o;
    public Context p;
    public View q;
    public TextView r;
    public TextView s;
    private TextView u;

    @Override // defpackage.auvy
    protected final void k(boolean z) {
        eqgc.t(this.l.c(z), new azjz(this, z), this.o);
    }

    public final void o() {
        eqgc.t(this.m.c(), new azjv(this), this.o);
    }

    @Override // defpackage.azkg, defpackage.auvy, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.p = this;
        if (auub.g()) {
            getWindow().addSystemFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        }
        setTheme(R.style.CrisisAlertsAppDayNightTheme);
        setContentView(R.layout.crisis_alerts_settings_sdk21);
        m(true);
        TextView textView = (TextView) findViewById(R.id.learn_more);
        this.u = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: azjq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CrisisAlertsSettingsChimeraActivity.this.p.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("")));
            }
        });
        CrisisAlertsSystemStateChangeIntentOperation.b(new Runnable() { // from class: azjr
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

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        eqgc.t(this.l.b(), new azjx(this), this.o);
    }
}
