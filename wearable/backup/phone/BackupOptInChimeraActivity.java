package com.google.android.gms.wearable.backup.phone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.R;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.backup.phone.BackupOptInChimeraActivity;
import com.google.android.gms.wearable.internal.NodeParcelable;
import defpackage.atad;
import defpackage.auad;
import defpackage.aupv;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.dlwv;
import defpackage.dlxc;
import defpackage.dlxi;
import defpackage.dlxo;
import defpackage.dlzp;
import defpackage.dogb;
import defpackage.dogc;
import defpackage.dohm;
import defpackage.dohn;
import defpackage.elgo;
import defpackage.fgou;
import defpackage.fgri;
import defpackage.fgrr;
import defpackage.fgsa;
import defpackage.rxx;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BackupOptInChimeraActivity extends rxx {
    public static final auad j = new dlxc("BackupOptInActivity");
    public static final dohn k;
    static final Optional l;
    static final Optional m;
    static final Optional n;
    static final Optional o;
    public final ScheduledExecutorService p = new aupv(1, 9);
    public String q;
    public String r;
    public dlzp s;
    public dlwv t;
    public Button u;
    public AppTheme v;
    public String w;
    public atad x;

    static {
        dohm dohmVar = (dohm) dohn.a.v();
        if (!dohmVar.b.L()) {
            dohmVar.U();
        }
        dohn.c((dohn) dohmVar.b);
        dohmVar.l(R.string.backup_opt_in_title);
        elgo t = elgo.t(Integer.valueOf(R.string.backup_opt_in_storage_header), Integer.valueOf(R.string.backup_opt_in_storage_body), Integer.valueOf(R.string.common_learn_more), Integer.valueOf(R.string.backup_opt_in_scheduling_header), Integer.valueOf(R.string.backup_opt_in_scheduling_body), Integer.valueOf(R.string.backup_opt_in_encryption_header), Integer.valueOf(R.string.backup_opt_in_encryption_body), Integer.valueOf(R.string.backup_opt_in_settings_header), Integer.valueOf(R.string.backup_opt_in_settings_body));
        if (!dohmVar.b.L()) {
            dohmVar.U();
        }
        dohn dohnVar = (dohn) dohmVar.b;
        dohnVar.b();
        fgou.E(t, dohnVar.d);
        dohmVar.k(R.string.common_turn_on);
        dohmVar.a(R.string.common_not_now);
        elgo n2 = elgo.n(Integer.valueOf(R.string.companion_backup_more_details_dialog_title), Integer.valueOf(R.string.companion_backup_more_details_dialog_body), Integer.valueOf(R.string.common_got_it));
        if (!dohmVar.b.L()) {
            dohmVar.U();
        }
        dohn dohnVar2 = (dohn) dohmVar.b;
        fgrr fgrrVar = dohnVar2.g;
        if (!fgrrVar.c()) {
            dohnVar2.g = fgri.C(fgrrVar);
        }
        fgou.E(n2, dohnVar2.g);
        k = (dohn) dohmVar.Q();
        l = Optional.empty();
        m = Optional.empty();
        n = Optional.empty();
        o = Optional.empty();
    }

    public static Intent a(String str, String str2, dogc dogcVar, String str3) {
        Intent putExtra = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.wearable.backup.phone.BackupOptInActivity").putExtra("node_id", str);
        if (str2 != null) {
            putExtra.putExtra("account_name", str2);
        }
        if (dogcVar != null) {
            putExtra.putExtra("backup_status", dogcVar.r());
        }
        putExtra.putExtra("calling_package", str3);
        return putExtra;
    }

    public final void k(final dogc dogcVar) {
        final fgsa fgsaVar = dogcVar.d;
        if (fgsaVar.isEmpty()) {
            setResult(6);
            dlxo.a(this, R.string.companion_backup_no_accounts_dialog_title, R.string.companion_backup_no_accounts_dialog_body, true, this.v);
            return;
        }
        final dogb dogbVar = this.r == null ? (dogb) fgsaVar.get(0) : (dogb) Collection.EL.stream(fgsaVar).filter(new Predicate() { // from class: dlxp
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo478negate() {
                return Predicate$CC.$default$negate(this);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                String str = ((dogb) obj).c;
                String str2 = BackupOptInChimeraActivity.this.r;
                ekvl.y(str2);
                return ekti.e(str, str2);
            }
        }).findFirst().orElse((dogb) fgsaVar.get(0));
        j.j("Showing backup opt-in UI for account %s", auad.q(dogbVar.c));
        this.t.a(dogbVar.c, (ImageView) findViewById(R.id.account_icon));
        ((TextView) findViewById(R.id.account_name)).setText(dogbVar.c);
        final Button button = (Button) findViewById(R.id.turn_on_button);
        button.setEnabled(true);
        button.setOnClickListener(new View.OnClickListener() { // from class: dlya
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupOptInChimeraActivity.j.j("User clicked 'turn on', enabling backup", new Object[0]);
                Button button2 = button;
                button2.setEnabled(false);
                final BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                backupOptInChimeraActivity.u.setClickable(false);
                dogb dogbVar2 = dogbVar;
                eqgc.t(eqgb.h(dqmr.b(backupOptInChimeraActivity.s.b(backupOptInChimeraActivity.q, dogbVar2.c, BackupOptInChimeraActivity.k))).i(fwbj.a.lK().e(), TimeUnit.SECONDS, backupOptInChimeraActivity.p), new dlyl(backupOptInChimeraActivity, dogbVar2, button2), new Executor() { // from class: dlyb
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        BackupOptInChimeraActivity.this.runOnUiThread(runnable);
                    }
                });
            }
        });
        ((ConstraintLayout) findViewById(R.id.account_touch_target)).setOnClickListener(new View.OnClickListener() { // from class: dlyc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                final dogc dogcVar2 = dogcVar;
                dlxm.a(backupOptInChimeraActivity.getContainerActivity(), fgsaVar, backupOptInChimeraActivity.t, new dhlq() { // from class: dlyi
                    @Override // defpackage.dhlq
                    public final void gC(Object obj) {
                        String str = ((dogb) obj).c;
                        BackupOptInChimeraActivity backupOptInChimeraActivity2 = BackupOptInChimeraActivity.this;
                        backupOptInChimeraActivity2.r = str;
                        dogc dogcVar3 = dogcVar2;
                        if (dogcVar3.c) {
                            doga dogaVar = dogcVar3.e;
                            if (dogaVar == null) {
                                dogaVar = doga.a;
                            }
                            String str2 = dogaVar.c;
                            String str3 = backupOptInChimeraActivity2.r;
                            ekvl.y(str3);
                            if (ekti.e(str2, str3)) {
                                BackupOptInChimeraActivity.j.j("User switched to the current backup account, finishing.", new Object[0]);
                                backupOptInChimeraActivity2.finish();
                                return;
                            }
                        }
                        backupOptInChimeraActivity2.k(dogcVar3);
                    }
                }, backupOptInChimeraActivity.v);
            }
        });
        dhlw f = this.s.f(this.q, dogbVar.c);
        f.z(new dhlq() { // from class: dlyd
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                long j2 = ((dogd) obj).c;
                BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                TextView textView = (TextView) backupOptInChimeraActivity.findViewById(R.id.storage_header);
                if (textView == null) {
                    return;
                }
                textView.setText(backupOptInChimeraActivity.getString(R.string.backup_opt_in_storage_header, new Object[]{dlxa.b(backupOptInChimeraActivity, j2)}));
            }
        });
        f.y(new dhln() { // from class: dlye
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                BackupOptInChimeraActivity.j.g("Failed to get storage quota data", exc, new Object[0]);
            }
        });
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        Optional optional;
        super.onCreate(bundle);
        if (bundle == null) {
            optional = Optional.ofNullable(getIntent().getStringExtra("node_id"));
            this.r = getIntent().getStringExtra("account_name");
            this.w = getIntent().getStringExtra("calling_package");
        } else {
            Optional ofNullable = Optional.ofNullable(bundle.getString("node_id"));
            this.r = bundle.getString("account_name");
            this.w = bundle.getString("calling_package");
            optional = ofNullable;
        }
        dlxi dlxiVar = (dlxi) o.orElseGet(new Supplier() { // from class: dlyj
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dlxi(dlwl.d(BackupOptInChimeraActivity.this));
            }
        });
        if (optional.isEmpty()) {
            j.f("Provided node_id extra was null", new Object[0]);
            dlxiVar.a(this.w, new Consumer() { // from class: dlxq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void u(Object obj) {
                    BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                    AppTheme appTheme = (AppTheme) obj;
                    dmmw.f(appTheme, backupOptInChimeraActivity.getIntent(), backupOptInChimeraActivity);
                    dlxo.b(backupOptInChimeraActivity, R.string.common_something_went_wrong, appTheme);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        String str = (String) optional.get();
        this.q = str;
        j.j("onCreate. node_id=".concat(String.valueOf(str)), new Object[0]);
        this.s = (dlzp) l.orElseGet(new Supplier() { // from class: dlxr
            @Override // java.util.function.Supplier
            public final Object get() {
                return dlzo.a(BackupOptInChimeraActivity.this);
            }
        });
        this.x = (atad) m.orElseGet(new Supplier() { // from class: dlxs
            @Override // java.util.function.Supplier
            public final Object get() {
                return dlwl.f(BackupOptInChimeraActivity.this);
            }
        });
        this.t = (dlwv) n.orElseGet(new Supplier() { // from class: dlxt
            @Override // java.util.function.Supplier
            public final Object get() {
                return dlwy.b(BackupOptInChimeraActivity.this);
            }
        });
        dlxiVar.a(this.w, new Consumer() { // from class: dlxu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void u(Object obj) {
                Optional empty;
                final BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                final AppTheme appTheme = (AppTheme) obj;
                backupOptInChimeraActivity.v = appTheme;
                dmmw.f(appTheme, backupOptInChimeraActivity.getIntent(), backupOptInChimeraActivity);
                backupOptInChimeraActivity.setContentView(dmmw.c(appTheme, backupOptInChimeraActivity.getLayoutInflater()).inflate(R.layout.companion_backup_opt_in_activity, (ViewGroup) null, false));
                if (appTheme.b() == 1) {
                    int i = edxt.a;
                }
                int d = edxu.d(backupOptInChimeraActivity, android.R.attr.colorBackground, "Background color");
                View findViewById = backupOptInChimeraActivity.findViewById(R.id.bottom_app_bar);
                findViewById.getBackground().setTint(d);
                findViewById.getBackground().setAlpha(backupOptInChimeraActivity.getResources().getInteger(R.integer.companion_backup_opt_in_button_bar_alpha));
                final LottieAnimationView lottieAnimationView = (LottieAnimationView) backupOptInChimeraActivity.findViewById(R.id.hero_animation);
                nwe i2 = nvl.i(backupOptInChimeraActivity, R.raw.wearable_companion_opt_in_animation_circular_dark);
                Objects.requireNonNull(lottieAnimationView);
                i2.e(new nvx() { // from class: dlyf
                    @Override // defpackage.nvx
                    public final void a(Object obj2) {
                        LottieAnimationView.this.l((nvd) obj2);
                    }
                });
                backupOptInChimeraActivity.u = (Button) backupOptInChimeraActivity.findViewById(R.id.not_now_button);
                backupOptInChimeraActivity.u.setOnClickListener(new View.OnClickListener() { // from class: dlyg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BackupOptInChimeraActivity backupOptInChimeraActivity2 = BackupOptInChimeraActivity.this;
                        backupOptInChimeraActivity2.s.d(backupOptInChimeraActivity2.q, emyt.COMPANION_OPT_IN);
                        backupOptInChimeraActivity2.finish();
                    }
                });
                backupOptInChimeraActivity.getOnBackPressedDispatcher().b(backupOptInChimeraActivity, new dlyk(backupOptInChimeraActivity));
                ((Button) backupOptInChimeraActivity.findViewById(R.id.storage_more_details)).setOnClickListener(new View.OnClickListener() { // from class: dlyh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BackupOptInChimeraActivity backupOptInChimeraActivity2 = BackupOptInChimeraActivity.this;
                        edzp edzpVar = new edzp(dmmw.b(backupOptInChimeraActivity2, appTheme));
                        edzpVar.N(backupOptInChimeraActivity2.getString(R.string.companion_backup_more_details_dialog_title));
                        edzpVar.C(backupOptInChimeraActivity2.getString(R.string.companion_backup_more_details_dialog_body));
                        edzpVar.L(backupOptInChimeraActivity2.getString(R.string.common_got_it), null);
                        edzpVar.create().show();
                    }
                });
                byte[] byteArrayExtra = backupOptInChimeraActivity.getIntent().getByteArrayExtra("backup_status");
                if (byteArrayExtra == null) {
                    empty = Optional.empty();
                } else {
                    try {
                        fgri y = fgri.y(dogc.a, byteArrayExtra, 0, byteArrayExtra.length, fgqp.a());
                        fgri.M(y);
                        empty = Optional.of((dogc) y);
                    } catch (fgsd e) {
                        BackupOptInChimeraActivity.j.n("BackupStatus extra proto was invalid.", e, new Object[0]);
                        empty = Optional.empty();
                    }
                }
                if (empty.isPresent()) {
                    backupOptInChimeraActivity.k((dogc) empty.get());
                } else {
                    dhlw bj = backupOptInChimeraActivity.x.bj();
                    bj.z(new dhlq() { // from class: dlxv
                        @Override // defpackage.dhlq
                        public final void gC(Object obj2) {
                            Stream stream = Collection.EL.stream((List) obj2);
                            final BackupOptInChimeraActivity backupOptInChimeraActivity2 = BackupOptInChimeraActivity.this;
                            if (!stream.anyMatch(new Predicate() { // from class: dlxx
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo478negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                @Override // java.util.function.Predicate
                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj3) {
                                    return ((NodeParcelable) obj3).a.equals(BackupOptInChimeraActivity.this.q);
                                }
                            })) {
                                BackupOptInChimeraActivity.j.f("Supplied nodeId is not connected to this device", new Object[0]);
                                dlxo.b(backupOptInChimeraActivity2, R.string.common_something_went_wrong, backupOptInChimeraActivity2.v);
                            } else {
                                BackupOptInChimeraActivity.j.j("Connected to supplied nodeId, fetching accounts from the watch", new Object[0]);
                                dhlw g = backupOptInChimeraActivity2.s.g(backupOptInChimeraActivity2.q);
                                g.z(new dhlq() { // from class: dlxy
                                    @Override // defpackage.dhlq
                                    public final void gC(Object obj3) {
                                        BackupOptInChimeraActivity.this.k((dogc) obj3);
                                    }
                                });
                                g.y(new dhln() { // from class: dlxz
                                    @Override // defpackage.dhln
                                    public final void gB(Exception exc) {
                                        BackupOptInChimeraActivity.j.g("Failed to get backup status", exc, new Object[0]);
                                        BackupOptInChimeraActivity backupOptInChimeraActivity3 = BackupOptInChimeraActivity.this;
                                        dlxo.b(backupOptInChimeraActivity3, R.string.companion_backup_status_fetch_error_dialog_title, backupOptInChimeraActivity3.v);
                                    }
                                });
                            }
                        }
                    });
                    bj.y(new dhln() { // from class: dlxw
                        @Override // defpackage.dhln
                        public final void gB(Exception exc) {
                            BackupOptInChimeraActivity.j.g("Failed to get connected nodes", exc, new Object[0]);
                            BackupOptInChimeraActivity backupOptInChimeraActivity2 = BackupOptInChimeraActivity.this;
                            dlxo.b(backupOptInChimeraActivity2, R.string.common_something_went_wrong, backupOptInChimeraActivity2.v);
                        }
                    });
                }
                LinearLayout linearLayout = (LinearLayout) backupOptInChimeraActivity.findViewById(R.id.header);
                dmmw.g(linearLayout, appTheme, (TextView) linearLayout.findViewById(R.id.title));
                dlxb.a((TextView) backupOptInChimeraActivity.findViewById(R.id.storage_body));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("node_id", this.q);
        bundle.putString("account_name", this.r);
        bundle.putString("calling_package", this.w);
        super.onSaveInstanceState(bundle);
    }
}
