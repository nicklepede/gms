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
import defpackage.aby;
import defpackage.aca;
import defpackage.auad;
import defpackage.aurp;
import defpackage.dlxc;
import defpackage.dmcv;
import defpackage.dmeu;
import defpackage.dmhl;
import defpackage.dmig;
import defpackage.dmio;
import defpackage.dmiq;
import defpackage.dmir;
import defpackage.dmis;
import defpackage.dofz;
import defpackage.doga;
import defpackage.dogc;
import defpackage.dogd;
import defpackage.ekvl;
import defpackage.eqgc;
import defpackage.evmj;
import defpackage.evmk;
import defpackage.evoj;
import defpackage.fgrc;
import defpackage.fgub;
import defpackage.fgvq;
import defpackage.fohs;
import defpackage.fwbj;
import defpackage.nlf;
import defpackage.nlg;
import defpackage.ryt;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class WearBackupSettingsChimeraActivity extends ryt {
    public static final auad j = new dlxc("WearBackupSettings");
    public static final evoj k;
    static final Optional l;
    static final Optional m;
    public dmcv n;
    public aca o;
    public aca p;
    public aurp q;
    public String r;
    public dofz s;
    public dogd t;
    private aca u;

    static {
        fgrc v = evoj.a.v();
        evmj evmjVar = (evmj) evmk.a.v();
        evmjVar.k(R.string.wear_backup_opt_in_notification_title);
        if (!v.b.L()) {
            v.U();
        }
        evoj evojVar = (evoj) v.b;
        evmk evmkVar = (evmk) evmjVar.Q();
        evmkVar.getClass();
        evojVar.c = evmkVar;
        evojVar.b |= 1;
        evmj evmjVar2 = (evmj) evmk.a.v();
        evmjVar2.k(R.string.wear_backup_opt_in_notification_text);
        if (!v.b.L()) {
            v.U();
        }
        evoj evojVar2 = (evoj) v.b;
        evmk evmkVar2 = (evmk) evmjVar2.Q();
        evmkVar2.getClass();
        evojVar2.d = evmkVar2;
        evojVar2.b |= 2;
        evmj evmjVar3 = (evmj) evmk.a.v();
        evmjVar3.k(R.string.common_turn_on);
        if (!v.b.L()) {
            v.U();
        }
        evoj evojVar3 = (evoj) v.b;
        evmk evmkVar3 = (evmk) evmjVar3.Q();
        evmkVar3.getClass();
        evojVar3.e = evmkVar3;
        evojVar3.b |= 4;
        k = (evoj) v.Q();
        l = Optional.empty();
        m = Optional.empty();
    }

    public static long a(dofz dofzVar) {
        return dofzVar.c + dofzVar.d + dofzVar.e;
    }

    public static Intent b() {
        return new Intent().setClassName("com.google.android.gms", "com.google.android.gms.wearable.backup.wear.WearBackupSettingsActivity").setFlags(67108864);
    }

    public static boolean k(dofz dofzVar) {
        fgub fgubVar = dofzVar.f;
        if (fgubVar == null) {
            fgubVar = fgub.a;
        }
        return fgvq.b(fgubVar) > 0 && a(dofzVar) > 0;
    }

    public final void c() {
        dofz dofzVar = this.s;
        dogd dogdVar = this.t;
        if (dofzVar == null || dogdVar == null) {
            return;
        }
        fgub fgubVar = dofzVar.f;
        if (fgubVar == null) {
            fgubVar = fgub.a;
        }
        long b = fgvq.b(fgubVar);
        long a = this.q.a();
        long j2 = dogdVar.c;
        boolean z = dogdVar.d >= j2 && j2 > 0;
        boolean k2 = k(dofzVar);
        boolean z2 = k2 && a - b > TimeUnit.SECONDS.toMillis(fwbj.c());
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

    public final void f(final dogc dogcVar) {
        doga dogaVar = dogcVar.e;
        if (dogaVar == null) {
            dogaVar = doga.a;
        }
        String str = dogaVar.c;
        this.r = str;
        auad auadVar = j;
        auadVar.j("Showing backup settings UI for account %s", auad.q(str));
        findViewById(R.id.container).setVisibility(0);
        doga dogaVar2 = dogcVar.e;
        if (dogaVar2 == null) {
            dogaVar2 = doga.a;
        }
        eqgc.t(this.n.d(dogaVar2.c), new dmiq(this), new dmig(this));
        eqgc.t(this.n.c(), new dmir(this), new dmig(this));
        ((LoadableTextView) findViewById(R.id.backup_account)).b(this.r);
        findViewById(R.id.backup_toggle_placeholder).setVisibility(8);
        SwitchBar switchBar = (SwitchBar) findViewById(R.id.backup_toggle);
        switchBar.setAccessibilityDelegate(new dmis(this));
        switchBar.setVisibility(0);
        switchBar.setOnClickListener(new View.OnClickListener() { // from class: dmim
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WearBackupSettingsChimeraActivity.j.j("Backup on-off toggle clicked, showing confirmation pop-up", new Object[0]);
                WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity = WearBackupSettingsChimeraActivity.this;
                aca acaVar = wearBackupSettingsChimeraActivity.o;
                ekvl.y(acaVar);
                acaVar.b(new dmhl(wearBackupSettingsChimeraActivity.getString(R.string.backup_opt_out_dialog_title), wearBackupSettingsChimeraActivity.getString(R.string.backup_opt_out_dialog_body), 0));
            }
        });
        Button button = (Button) findViewById(R.id.change_account_btn);
        if (dogcVar.d.size() == 1) {
            auadVar.j("Only one eligible backup account, not showing change account button", new Object[0]);
            button.setVisibility(8);
        } else {
            auadVar.j("Multiple eligible backup accounts, showing change account button", new Object[0]);
            button.setVisibility(0);
            button.setOnClickListener(new View.OnClickListener() { // from class: dmin
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aca acaVar = WearBackupSettingsChimeraActivity.this.p;
                    ekvl.y(acaVar);
                    acaVar.b(dogcVar);
                }
            });
        }
    }

    public final void g() {
        j.j("Showing backup enabled confirmation overlay.", new Object[0]);
        nlg nlgVar = new nlg();
        nlgVar.a = (int) fwbj.a.lK().a();
        nlgVar.b = getText(R.string.wear_backup_enabled_confirmation_overlay);
        View findViewById = findViewById(R.id.container);
        if (nlgVar.e) {
            return;
        }
        nlgVar.e = true;
        Context context = findViewById.getContext();
        if (nlgVar.c == null) {
            nlgVar.c = LayoutInflater.from(context).inflate(R.layout.ws_overlay_confirmation, (ViewGroup) null);
        }
        nlgVar.c.setOnTouchListener(new nlf());
        nlgVar.c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View view = nlgVar.c;
        nlgVar.d = context.getDrawable(R.drawable.confirmation_animation);
        ((ImageView) view.findViewById(R.id.wearable_support_confirmation_overlay_image)).setImageDrawable(nlgVar.d);
        TextView textView = (TextView) nlgVar.c.findViewById(R.id.wearable_support_confirmation_overlay_message);
        if (nlgVar.b.length() == 0) {
            textView.setVisibility(8);
        } else {
            float fraction = context.getResources().getFraction(R.fraction.confirmation_overlay_text_inset_margin, 1, 1) * context.getResources().getDisplayMetrics().widthPixels;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            int i = (int) fraction;
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i;
            textView.setLayoutParams(marginLayoutParams);
            textView.setText(nlgVar.b);
            textView.setVisibility(0);
        }
        ((ViewGroup) findViewById.getRootView()).addView(nlgVar.c);
        nlgVar.c.setContentDescription(!nlgVar.b.toString().isEmpty() ? nlgVar.b : nlgVar.c.getContext().getString(R.string.confirmation_overlay_a11y_description_success));
        nlgVar.c.requestFocus();
        nlgVar.c.sendAccessibilityEvent(8);
        Object obj = nlgVar.d;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
        nlgVar.f.postDelayed(nlgVar.g, ((AccessibilityManager) nlgVar.c.getContext().getSystemService(AccessibilityManager.class)).isEnabled() ? Math.max(5000, nlgVar.a) : nlgVar.a);
    }

    public final void h(int i, boolean z) {
        startActivity(WearBackupDialogChimeraActivity.a(getString(i)));
        if (z) {
            finish();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = (dmcv) l.orElseGet(new Supplier() { // from class: dmih
            @Override // java.util.function.Supplier
            public final Object get() {
                return dmdv.f(WearBackupSettingsChimeraActivity.this);
            }
        });
        this.q = (aurp) m.orElseGet(new Supplier() { // from class: dmii
            @Override // java.util.function.Supplier
            public final Object get() {
                return aurt.a;
            }
        });
        j.j("onCreate", new Object[0]);
        setContentView(R.layout.wear_backup_settings_activity);
        dmeu.a(this, findViewById(R.id.container));
        this.p = WearBackupAccountPickerChimeraActivity.a(this, new aby() { // from class: dmij
            @Override // defpackage.aby
            public final void jF(Object obj) {
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity = WearBackupSettingsChimeraActivity.this;
                ekvl.y(str);
                String str2 = wearBackupSettingsChimeraActivity.r;
                ekvl.y(str2);
                if (ekti.e(str, str2)) {
                    return;
                }
                WearBackupSettingsChimeraActivity.j.j("User chose to change account, opening backup opt-in screen", new Object[0]);
                wearBackupSettingsChimeraActivity.startActivity(WearBackupOptInChimeraActivity.a(str));
            }
        });
        this.o = WearBackupConfirmationChimeraActivity.a(this, new aby() { // from class: dmik
            @Override // defpackage.aby
            public final void jF(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    WearBackupSettingsChimeraActivity.j.j("User cancelled disabling backup", new Object[0]);
                    return;
                }
                WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity = WearBackupSettingsChimeraActivity.this;
                WearBackupSettingsChimeraActivity.j.j("User confirmed disabling backup", new Object[0]);
                SwitchBar switchBar = (SwitchBar) wearBackupSettingsChimeraActivity.findViewById(R.id.backup_toggle);
                switchBar.setChecked(false);
                switchBar.setClickable(false);
                dmcv dmcvVar = wearBackupSettingsChimeraActivity.n;
                euyj euyjVar = euyj.anl;
                fgrc v = evok.a.v();
                evmk evmkVar = evmk.a;
                evmj evmjVar = (evmj) evmkVar.v();
                evmjVar.k(R.string.backup_toggle_label);
                if (!v.b.L()) {
                    v.U();
                }
                evok evokVar = (evok) v.b;
                evmk evmkVar2 = (evmk) evmjVar.Q();
                evmkVar2.getClass();
                evokVar.c = evmkVar2;
                evokVar.b |= 1;
                evmj evmjVar2 = (evmj) evmkVar.v();
                evmjVar2.k(R.string.backup_opt_out_dialog_title);
                if (!v.b.L()) {
                    v.U();
                }
                evok evokVar2 = (evok) v.b;
                evmk evmkVar3 = (evmk) evmjVar2.Q();
                evmkVar3.getClass();
                evokVar2.d = evmkVar3;
                evokVar2.b |= 2;
                evmj evmjVar3 = (evmj) evmkVar.v();
                evmjVar3.k(R.string.backup_opt_out_dialog_body);
                if (!v.b.L()) {
                    v.U();
                }
                evok evokVar3 = (evok) v.b;
                evmk evmkVar4 = (evmk) evmjVar3.Q();
                evmkVar4.getClass();
                evokVar3.e = evmkVar4;
                evokVar3.b |= 4;
                evmj evmjVar4 = (evmj) evmkVar.v();
                evmjVar4.k(R.string.common_confirm);
                if (!v.b.L()) {
                    v.U();
                }
                evok evokVar4 = (evok) v.b;
                evmk evmkVar5 = (evmk) evmjVar4.Q();
                evmkVar5.getClass();
                evokVar4.f = evmkVar5;
                evokVar4.b |= 8;
                evmj evmjVar5 = (evmj) evmkVar.v();
                evmjVar5.k(R.string.common_cancel);
                if (!v.b.L()) {
                    v.U();
                }
                evok evokVar5 = (evok) v.b;
                evmk evmkVar6 = (evmk) evmjVar5.Q();
                evmkVar6.getClass();
                evokVar5.g = evmkVar6;
                evokVar5.b |= 16;
                eqgc.t(dmcvVar.a(euyjVar, (evok) v.Q(), null), new dmit(wearBackupSettingsChimeraActivity, switchBar), new dmig(wearBackupSettingsChimeraActivity));
            }
        });
        this.u = WearBackupConfirmationChimeraActivity.a(this, new aby() { // from class: dmil
            @Override // defpackage.aby
            public final void jF(Object obj) {
                WearBackupSettingsChimeraActivity.this.finish();
            }
        });
        if (fohs.c()) {
            return;
        }
        eqgc.t(this.n.e(), new dmio(this), new dmig(this));
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        if (fohs.c()) {
            aca acaVar = this.u;
            ekvl.y(acaVar);
            acaVar.b(new dmhl(getString(R.string.wear_backup_rollback_title), getString(R.string.wear_backup_rollback_text), 2));
        }
    }
}
