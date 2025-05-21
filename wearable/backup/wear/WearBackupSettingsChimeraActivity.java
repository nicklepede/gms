package com.google.android.gms.wearable.backup.wear;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.common.widget.phone.SwitchBar;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInChimeraActivity;
import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;
import defpackage.abt;
import defpackage.abv;
import defpackage.arxo;
import defpackage.asnv;
import defpackage.djlj;
import defpackage.djrc;
import defpackage.djtb;
import defpackage.djvs;
import defpackage.djwn;
import defpackage.djwv;
import defpackage.djwx;
import defpackage.djwy;
import defpackage.djwz;
import defpackage.dlui;
import defpackage.dluj;
import defpackage.dlul;
import defpackage.dlum;
import defpackage.eiig;
import defpackage.ensj;
import defpackage.eswt;
import defpackage.eswu;
import defpackage.esyt;
import defpackage.fecj;
import defpackage.fefi;
import defpackage.fegx;
import defpackage.flqi;
import defpackage.ftfu;
import defpackage.lsx;
import defpackage.lsy;
import defpackage.qfp;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class WearBackupSettingsChimeraActivity extends qfp {
    public static final arxo j = new djlj("WearBackupSettings");
    public static final esyt k;
    static final Optional l;
    static final Optional m;
    public djrc n;
    public abv o;
    public abv p;
    public asnv q;
    public String r;
    public dlui s;
    public dlum t;
    private abv u;

    static {
        fecj v = esyt.a.v();
        eswt eswtVar = (eswt) eswu.a.v();
        eswtVar.k(R.string.wear_backup_opt_in_notification_title);
        if (!v.b.L()) {
            v.U();
        }
        esyt esytVar = (esyt) v.b;
        eswu eswuVar = (eswu) eswtVar.Q();
        eswuVar.getClass();
        esytVar.c = eswuVar;
        esytVar.b |= 1;
        eswt eswtVar2 = (eswt) eswu.a.v();
        eswtVar2.k(R.string.wear_backup_opt_in_notification_text);
        if (!v.b.L()) {
            v.U();
        }
        esyt esytVar2 = (esyt) v.b;
        eswu eswuVar2 = (eswu) eswtVar2.Q();
        eswuVar2.getClass();
        esytVar2.d = eswuVar2;
        esytVar2.b |= 2;
        eswt eswtVar3 = (eswt) eswu.a.v();
        eswtVar3.k(R.string.common_turn_on);
        if (!v.b.L()) {
            v.U();
        }
        esyt esytVar3 = (esyt) v.b;
        eswu eswuVar3 = (eswu) eswtVar3.Q();
        eswuVar3.getClass();
        esytVar3.e = eswuVar3;
        esytVar3.b |= 4;
        k = (esyt) v.Q();
        l = Optional.empty();
        m = Optional.empty();
    }

    public static long a(dlui dluiVar) {
        return dluiVar.c + dluiVar.d + dluiVar.e;
    }

    public static Intent b() {
        return new Intent().setClassName("com.google.android.gms", "com.google.android.gms.wearable.backup.wear.WearBackupSettingsActivity").setFlags(67108864);
    }

    public static boolean k(dlui dluiVar) {
        fefi fefiVar = dluiVar.f;
        if (fefiVar == null) {
            fefiVar = fefi.a;
        }
        return fegx.b(fefiVar) > 0 && a(dluiVar) > 0;
    }

    public final void c() {
        dlui dluiVar = this.s;
        dlum dlumVar = this.t;
        if (dluiVar == null || dlumVar == null) {
            return;
        }
        fefi fefiVar = dluiVar.f;
        if (fefiVar == null) {
            fefiVar = fefi.a;
        }
        long b = fegx.b(fefiVar);
        long a = this.q.a();
        long j2 = dlumVar.c;
        boolean z = dlumVar.d >= j2 && j2 > 0;
        boolean k2 = k(dluiVar);
        boolean z2 = k2 && a - b > TimeUnit.SECONDS.toMillis(ftfu.c());
        j.j("Updating error subtitle for: hasBackup=%s quotaFull=%s backupTooOld=%s", Boolean.valueOf(k2), Boolean.valueOf(z), Boolean.valueOf(z2));
        TextView textView = (TextView) findViewById(R.id.subtitle_backup_error);
        if (z) {
            textView.setVisibility(0);
            textView.setText(R.string.wear_backup_settings_subtitle_out_of_quota);
        } else if (!z2) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(R.string.wear_backup_settings_subtitle_backup_too_old);
        }
    }

    public final void f(final dlul dlulVar) {
        dluj dlujVar = dlulVar.e;
        if (dlujVar == null) {
            dlujVar = dluj.a;
        }
        String str = dlujVar.c;
        this.r = str;
        arxo arxoVar = j;
        arxoVar.j("Showing backup settings UI for account %s", arxo.q(str));
        findViewById(R.id.container).setVisibility(0);
        dluj dlujVar2 = dlulVar.e;
        if (dlujVar2 == null) {
            dlujVar2 = dluj.a;
        }
        ensj.t(this.n.d(dlujVar2.c), new djwx(this), new djwn(this));
        ensj.t(this.n.c(), new djwy(this), new djwn(this));
        ((LoadableTextView) findViewById(R.id.backup_account)).b(this.r);
        findViewById(R.id.backup_toggle_placeholder).setVisibility(8);
        SwitchBar switchBar = (SwitchBar) findViewById(R.id.backup_toggle);
        switchBar.setAccessibilityDelegate(new djwz(this));
        switchBar.setVisibility(0);
        switchBar.setOnClickListener(new View.OnClickListener() { // from class: djwt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WearBackupSettingsChimeraActivity.j.j("Backup on-off toggle clicked, showing confirmation pop-up", new Object[0]);
                WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity = WearBackupSettingsChimeraActivity.this;
                abv abvVar = wearBackupSettingsChimeraActivity.o;
                eiig.x(abvVar);
                abvVar.b(new djvs(wearBackupSettingsChimeraActivity.getString(R.string.backup_opt_out_dialog_title), wearBackupSettingsChimeraActivity.getString(R.string.backup_opt_out_dialog_body), 0));
            }
        });
        Button button = (Button) findViewById(R.id.change_account_btn);
        if (dlulVar.d.size() == 1) {
            arxoVar.j("Only one eligible backup account, not showing change account button", new Object[0]);
            button.setVisibility(8);
        } else {
            arxoVar.j("Multiple eligible backup accounts, showing change account button", new Object[0]);
            button.setVisibility(0);
            button.setOnClickListener(new View.OnClickListener() { // from class: djwu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    abv abvVar = WearBackupSettingsChimeraActivity.this.p;
                    eiig.x(abvVar);
                    abvVar.b(dlulVar);
                }
            });
        }
    }

    public final void g() {
        j.j("Showing backup enabled confirmation overlay.", new Object[0]);
        lsy lsyVar = new lsy();
        lsyVar.a = (int) ftfu.a.a().a();
        lsyVar.b = getText(R.string.wear_backup_enabled_confirmation_overlay);
        View findViewById = findViewById(R.id.container);
        if (lsyVar.e) {
            return;
        }
        lsyVar.e = true;
        Context context = findViewById.getContext();
        if (lsyVar.c == null) {
            lsyVar.c = LayoutInflater.from(context).inflate(R.layout.ws_overlay_confirmation, (ViewGroup) null);
        }
        lsyVar.c.setOnTouchListener(new lsx());
        lsyVar.c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View view = lsyVar.c;
        lsyVar.d = context.getDrawable(R.drawable.confirmation_animation);
        ((ImageView) view.findViewById(R.id.wearable_support_confirmation_overlay_image)).setImageDrawable(lsyVar.d);
        TextView textView = (TextView) lsyVar.c.findViewById(R.id.wearable_support_confirmation_overlay_message);
        if (lsyVar.b.length() == 0) {
            textView.setVisibility(8);
        } else {
            float fraction = context.getResources().getFraction(R.fraction.confirmation_overlay_text_inset_margin, 1, 1) * context.getResources().getDisplayMetrics().widthPixels;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            int i = (int) fraction;
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i;
            textView.setLayoutParams(marginLayoutParams);
            textView.setText(lsyVar.b);
            textView.setVisibility(0);
        }
        ((ViewGroup) findViewById.getRootView()).addView(lsyVar.c);
        lsyVar.c.setContentDescription(!lsyVar.b.toString().isEmpty() ? lsyVar.b : lsyVar.c.getContext().getString(R.string.confirmation_overlay_a11y_description_success));
        lsyVar.c.requestFocus();
        lsyVar.c.sendAccessibilityEvent(8);
        Object obj = lsyVar.d;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
        lsyVar.f.postDelayed(lsyVar.g, ((AccessibilityManager) lsyVar.c.getContext().getSystemService(AccessibilityManager.class)).isEnabled() ? Math.max(5000, lsyVar.a) : lsyVar.a);
    }

    public final void h(int i, boolean z) {
        startActivity(WearBackupDialogChimeraActivity.a(getString(i)));
        if (z) {
            finish();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = (djrc) l.orElseGet(new Supplier() { // from class: djwo
            @Override // java.util.function.Supplier
            public final Object get() {
                return djsc.f(WearBackupSettingsChimeraActivity.this);
            }
        });
        this.q = (asnv) m.orElseGet(new Supplier() { // from class: djwp
            @Override // java.util.function.Supplier
            public final Object get() {
                return asnz.a;
            }
        });
        j.j("onCreate", new Object[0]);
        setContentView(R.layout.wear_backup_settings_activity);
        djtb.a(this, findViewById(R.id.container));
        this.p = WearBackupAccountPickerChimeraActivity.a(this, new abt() { // from class: djwq
            @Override // defpackage.abt
            public final void jq(Object obj) {
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity = WearBackupSettingsChimeraActivity.this;
                eiig.x(str);
                String str2 = wearBackupSettingsChimeraActivity.r;
                eiig.x(str2);
                if (eigd.e(str, str2)) {
                    return;
                }
                WearBackupSettingsChimeraActivity.j.j("User chose to change account, opening backup opt-in screen", new Object[0]);
                wearBackupSettingsChimeraActivity.startActivity(WearBackupOptInChimeraActivity.a(str));
            }
        });
        this.o = WearBackupConfirmationChimeraActivity.a(this, new abt() { // from class: djwr
            @Override // defpackage.abt
            public final void jq(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    WearBackupSettingsChimeraActivity.j.j("User cancelled disabling backup", new Object[0]);
                    return;
                }
                WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity = WearBackupSettingsChimeraActivity.this;
                WearBackupSettingsChimeraActivity.j.j("User confirmed disabling backup", new Object[0]);
                SwitchBar switchBar = (SwitchBar) wearBackupSettingsChimeraActivity.findViewById(R.id.backup_toggle);
                switchBar.setChecked(false);
                switchBar.setClickable(false);
                djrc djrcVar = wearBackupSettingsChimeraActivity.n;
                esiu esiuVar = esiu.amV;
                fecj v = esyu.a.v();
                eswt eswtVar = (eswt) eswu.a.v();
                eswtVar.k(R.string.backup_toggle_label);
                if (!v.b.L()) {
                    v.U();
                }
                esyu esyuVar = (esyu) v.b;
                eswu eswuVar = (eswu) eswtVar.Q();
                eswuVar.getClass();
                esyuVar.c = eswuVar;
                esyuVar.b |= 1;
                eswu eswuVar2 = eswu.a;
                eswt eswtVar2 = (eswt) eswuVar2.v();
                eswtVar2.k(R.string.backup_opt_out_dialog_title);
                if (!v.b.L()) {
                    v.U();
                }
                esyu esyuVar2 = (esyu) v.b;
                eswu eswuVar3 = (eswu) eswtVar2.Q();
                eswuVar3.getClass();
                esyuVar2.d = eswuVar3;
                esyuVar2.b |= 2;
                eswt eswtVar3 = (eswt) eswuVar2.v();
                eswtVar3.k(R.string.backup_opt_out_dialog_body);
                if (!v.b.L()) {
                    v.U();
                }
                esyu esyuVar3 = (esyu) v.b;
                eswu eswuVar4 = (eswu) eswtVar3.Q();
                eswuVar4.getClass();
                esyuVar3.e = eswuVar4;
                esyuVar3.b |= 4;
                eswt eswtVar4 = (eswt) eswuVar2.v();
                eswtVar4.k(R.string.common_confirm);
                if (!v.b.L()) {
                    v.U();
                }
                esyu esyuVar4 = (esyu) v.b;
                eswu eswuVar5 = (eswu) eswtVar4.Q();
                eswuVar5.getClass();
                esyuVar4.f = eswuVar5;
                esyuVar4.b |= 8;
                eswt eswtVar5 = (eswt) eswuVar2.v();
                eswtVar5.k(R.string.common_cancel);
                if (!v.b.L()) {
                    v.U();
                }
                esyu esyuVar5 = (esyu) v.b;
                eswu eswuVar6 = (eswu) eswtVar5.Q();
                eswuVar6.getClass();
                esyuVar5.g = eswuVar6;
                esyuVar5.b |= 16;
                ensj.t(djrcVar.a(esiuVar, (esyu) v.Q(), null), new djxa(wearBackupSettingsChimeraActivity, switchBar), new djwn(wearBackupSettingsChimeraActivity));
            }
        });
        this.u = WearBackupConfirmationChimeraActivity.a(this, new abt() { // from class: djws
            @Override // defpackage.abt
            public final void jq(Object obj) {
                WearBackupSettingsChimeraActivity.this.finish();
            }
        });
        if (flqi.c()) {
            return;
        }
        ensj.t(this.n.e(), new djwv(this), new djwn(this));
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        if (flqi.c()) {
            abv abvVar = this.u;
            eiig.x(abvVar);
            abvVar.b(new djvs(getString(R.string.wear_backup_rollback_title), getString(R.string.wear_backup_rollback_text), 2));
        }
    }
}
