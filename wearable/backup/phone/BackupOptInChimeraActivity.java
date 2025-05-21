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
import defpackage.aqxo;
import defpackage.arxo;
import defpackage.asmb;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.djlc;
import defpackage.djlj;
import defpackage.djlp;
import defpackage.djlv;
import defpackage.djnw;
import defpackage.dluk;
import defpackage.dlul;
import defpackage.dlvv;
import defpackage.dlvw;
import defpackage.eitj;
import defpackage.feab;
import defpackage.fecp;
import defpackage.fecy;
import defpackage.fedh;
import defpackage.qet;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BackupOptInChimeraActivity extends qet {
    public static final arxo j = new djlj("BackupOptInActivity");
    public static final dlvw k;
    static final Optional l;
    static final Optional m;
    static final Optional n;
    static final Optional o;
    public final ScheduledExecutorService p = new asmb(1, 9);
    public String q;
    public String r;
    public djnw s;
    public djlc t;
    public Button u;
    public AppTheme v;
    public String w;
    public aqxo x;

    static {
        dlvv dlvvVar = (dlvv) dlvw.a.v();
        if (!dlvvVar.b.L()) {
            dlvvVar.U();
        }
        dlvw.c((dlvw) dlvvVar.b);
        dlvvVar.l(R.string.backup_opt_in_title);
        eitj t = eitj.t(Integer.valueOf(R.string.backup_opt_in_storage_header), Integer.valueOf(R.string.backup_opt_in_storage_body), Integer.valueOf(R.string.common_learn_more), Integer.valueOf(R.string.backup_opt_in_scheduling_header), Integer.valueOf(R.string.backup_opt_in_scheduling_body), Integer.valueOf(R.string.backup_opt_in_encryption_header), Integer.valueOf(R.string.backup_opt_in_encryption_body), Integer.valueOf(R.string.backup_opt_in_settings_header), Integer.valueOf(R.string.backup_opt_in_settings_body));
        if (!dlvvVar.b.L()) {
            dlvvVar.U();
        }
        dlvw dlvwVar = (dlvw) dlvvVar.b;
        dlvwVar.b();
        feab.E(t, dlvwVar.d);
        dlvvVar.k(R.string.common_turn_on);
        dlvvVar.a(R.string.common_not_now);
        eitj n2 = eitj.n(Integer.valueOf(R.string.companion_backup_more_details_dialog_title), Integer.valueOf(R.string.companion_backup_more_details_dialog_body), Integer.valueOf(R.string.common_got_it));
        if (!dlvvVar.b.L()) {
            dlvvVar.U();
        }
        dlvw dlvwVar2 = (dlvw) dlvvVar.b;
        fecy fecyVar = dlvwVar2.g;
        if (!fecyVar.c()) {
            dlvwVar2.g = fecp.C(fecyVar);
        }
        feab.E(n2, dlvwVar2.g);
        k = (dlvw) dlvvVar.Q();
        l = Optional.empty();
        m = Optional.empty();
        n = Optional.empty();
        o = Optional.empty();
    }

    public static Intent a(String str, String str2, dlul dlulVar, String str3) {
        Intent putExtra = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.wearable.backup.phone.BackupOptInActivity").putExtra("node_id", str);
        if (str2 != null) {
            putExtra.putExtra("account_name", str2);
        }
        if (dlulVar != null) {
            putExtra.putExtra("backup_status", dlulVar.r());
        }
        putExtra.putExtra("calling_package", str3);
        return putExtra;
    }

    public final void k(final dlul dlulVar) {
        final fedh fedhVar = dlulVar.d;
        if (fedhVar.isEmpty()) {
            setResult(6);
            djlv.a(this, R.string.companion_backup_no_accounts_dialog_title, R.string.companion_backup_no_accounts_dialog_body, true, this.v);
            return;
        }
        final dluk dlukVar = this.r == null ? (dluk) fedhVar.get(0) : (dluk) Collection.EL.stream(fedhVar).filter(new Predicate() { // from class: djlw
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo463negate() {
                return Predicate$CC.$default$negate(this);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                String str = ((dluk) obj).c;
                String str2 = BackupOptInChimeraActivity.this.r;
                eiig.x(str2);
                return eigd.e(str, str2);
            }
        }).findFirst().orElse((dluk) fedhVar.get(0));
        j.j("Showing backup opt-in UI for account %s", arxo.q(dlukVar.c));
        this.t.a(dlukVar.c, (ImageView) findViewById(R.id.account_icon));
        ((TextView) findViewById(R.id.account_name)).setText(dlukVar.c);
        final Button button = (Button) findViewById(R.id.turn_on_button);
        button.setEnabled(true);
        button.setOnClickListener(new View.OnClickListener() { // from class: djmh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackupOptInChimeraActivity.j.j("User clicked 'turn on', enabling backup", new Object[0]);
                Button button2 = button;
                button2.setEnabled(false);
                final BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                backupOptInChimeraActivity.u.setClickable(false);
                dluk dlukVar2 = dlukVar;
                ensj.t(ensi.h(doci.b(backupOptInChimeraActivity.s.b(backupOptInChimeraActivity.q, dlukVar2.c, BackupOptInChimeraActivity.k))).i(ftfu.a.a().e(), TimeUnit.SECONDS, backupOptInChimeraActivity.p), new djms(backupOptInChimeraActivity, dlukVar2, button2), new Executor() { // from class: djmi
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        BackupOptInChimeraActivity.this.runOnUiThread(runnable);
                    }
                });
            }
        });
        ((ConstraintLayout) findViewById(R.id.account_touch_target)).setOnClickListener(new View.OnClickListener() { // from class: djmj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                final dlul dlulVar2 = dlulVar;
                djlt.a(backupOptInChimeraActivity.getContainerActivity(), fedhVar, backupOptInChimeraActivity.t, new dfak() { // from class: djmp
                    @Override // defpackage.dfak
                    public final void gn(Object obj) {
                        String str = ((dluk) obj).c;
                        BackupOptInChimeraActivity backupOptInChimeraActivity2 = BackupOptInChimeraActivity.this;
                        backupOptInChimeraActivity2.r = str;
                        dlul dlulVar3 = dlulVar2;
                        if (dlulVar3.c) {
                            dluj dlujVar = dlulVar3.e;
                            if (dlujVar == null) {
                                dlujVar = dluj.a;
                            }
                            String str2 = dlujVar.c;
                            String str3 = backupOptInChimeraActivity2.r;
                            eiig.x(str3);
                            if (eigd.e(str2, str3)) {
                                BackupOptInChimeraActivity.j.j("User switched to the current backup account, finishing.", new Object[0]);
                                backupOptInChimeraActivity2.finish();
                                return;
                            }
                        }
                        backupOptInChimeraActivity2.k(dlulVar3);
                    }
                }, backupOptInChimeraActivity.v);
            }
        });
        dfaq f = this.s.f(this.q, dlukVar.c);
        f.z(new dfak() { // from class: djmk
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                long j2 = ((dlum) obj).c;
                BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                TextView textView = (TextView) backupOptInChimeraActivity.findViewById(R.id.storage_header);
                if (textView == null) {
                    return;
                }
                textView.setText(backupOptInChimeraActivity.getString(R.string.backup_opt_in_storage_header, new Object[]{djlh.b(backupOptInChimeraActivity, j2)}));
            }
        });
        f.y(new dfah() { // from class: djml
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                BackupOptInChimeraActivity.j.g("Failed to get storage quota data", exc, new Object[0]);
            }
        });
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
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
        djlp djlpVar = (djlp) o.orElseGet(new Supplier() { // from class: djmq
            @Override // java.util.function.Supplier
            public final Object get() {
                return new djlp(djks.d(BackupOptInChimeraActivity.this));
            }
        });
        if (optional.isEmpty()) {
            j.f("Provided node_id extra was null", new Object[0]);
            djlpVar.a(this.w, new Consumer() { // from class: djlx
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj) {
                    BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                    AppTheme appTheme = (AppTheme) obj;
                    dkbd.f(appTheme, backupOptInChimeraActivity.getIntent(), backupOptInChimeraActivity);
                    djlv.b(backupOptInChimeraActivity, R.string.common_something_went_wrong, appTheme);
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
        this.s = (djnw) l.orElseGet(new Supplier() { // from class: djly
            @Override // java.util.function.Supplier
            public final Object get() {
                return djnv.a(BackupOptInChimeraActivity.this);
            }
        });
        this.x = (aqxo) m.orElseGet(new Supplier() { // from class: djlz
            @Override // java.util.function.Supplier
            public final Object get() {
                return djks.f(BackupOptInChimeraActivity.this);
            }
        });
        this.t = (djlc) n.orElseGet(new Supplier() { // from class: djma
            @Override // java.util.function.Supplier
            public final Object get() {
                return djlf.b(BackupOptInChimeraActivity.this);
            }
        });
        djlpVar.a(this.w, new Consumer() { // from class: djmb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void q(Object obj) {
                Optional empty;
                final BackupOptInChimeraActivity backupOptInChimeraActivity = BackupOptInChimeraActivity.this;
                final AppTheme appTheme = (AppTheme) obj;
                backupOptInChimeraActivity.v = appTheme;
                dkbd.f(appTheme, backupOptInChimeraActivity.getIntent(), backupOptInChimeraActivity);
                backupOptInChimeraActivity.setContentView(dkbd.c(appTheme, backupOptInChimeraActivity.getLayoutInflater()).inflate(R.layout.companion_backup_opt_in_activity, (ViewGroup) null, false));
                if (appTheme.b() == 1) {
                    int i = eble.a;
                }
                int d = eblf.d(backupOptInChimeraActivity, android.R.attr.colorBackground, "Background color");
                View findViewById = backupOptInChimeraActivity.findViewById(R.id.bottom_app_bar);
                findViewById.getBackground().setTint(d);
                findViewById.getBackground().setAlpha(backupOptInChimeraActivity.getResources().getInteger(R.integer.companion_backup_opt_in_button_bar_alpha));
                final LottieAnimationView lottieAnimationView = (LottieAnimationView) backupOptInChimeraActivity.findViewById(R.id.hero_animation);
                mdw i2 = mdd.i(backupOptInChimeraActivity, R.raw.wearable_companion_opt_in_animation_circular_dark);
                Objects.requireNonNull(lottieAnimationView);
                i2.e(new mdp() { // from class: djmm
                    @Override // defpackage.mdp
                    public final void a(Object obj2) {
                        LottieAnimationView.this.l((mcv) obj2);
                    }
                });
                backupOptInChimeraActivity.u = (Button) backupOptInChimeraActivity.findViewById(R.id.not_now_button);
                backupOptInChimeraActivity.u.setOnClickListener(new View.OnClickListener() { // from class: djmn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BackupOptInChimeraActivity backupOptInChimeraActivity2 = BackupOptInChimeraActivity.this;
                        backupOptInChimeraActivity2.s.d(backupOptInChimeraActivity2.q, eklh.COMPANION_OPT_IN);
                        backupOptInChimeraActivity2.finish();
                    }
                });
                backupOptInChimeraActivity.getOnBackPressedDispatcher().b(backupOptInChimeraActivity, new djmr(backupOptInChimeraActivity));
                ((Button) backupOptInChimeraActivity.findViewById(R.id.storage_more_details)).setOnClickListener(new View.OnClickListener() { // from class: djmo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BackupOptInChimeraActivity backupOptInChimeraActivity2 = BackupOptInChimeraActivity.this;
                        ebna ebnaVar = new ebna(dkbd.b(backupOptInChimeraActivity2, appTheme));
                        ebnaVar.N(backupOptInChimeraActivity2.getString(R.string.companion_backup_more_details_dialog_title));
                        ebnaVar.C(backupOptInChimeraActivity2.getString(R.string.companion_backup_more_details_dialog_body));
                        ebnaVar.L(backupOptInChimeraActivity2.getString(R.string.common_got_it), null);
                        ebnaVar.create().show();
                    }
                });
                byte[] byteArrayExtra = backupOptInChimeraActivity.getIntent().getByteArrayExtra("backup_status");
                if (byteArrayExtra == null) {
                    empty = Optional.empty();
                } else {
                    try {
                        fecp y = fecp.y(dlul.a, byteArrayExtra, 0, byteArrayExtra.length, febw.a());
                        fecp.M(y);
                        empty = Optional.of((dlul) y);
                    } catch (fedk e) {
                        BackupOptInChimeraActivity.j.n("BackupStatus extra proto was invalid.", e, new Object[0]);
                        empty = Optional.empty();
                    }
                }
                if (empty.isPresent()) {
                    backupOptInChimeraActivity.k((dlul) empty.get());
                } else {
                    dfaq bk = backupOptInChimeraActivity.x.bk();
                    bk.z(new dfak() { // from class: djmc
                        @Override // defpackage.dfak
                        public final void gn(Object obj2) {
                            Stream stream = Collection.EL.stream((List) obj2);
                            final BackupOptInChimeraActivity backupOptInChimeraActivity2 = BackupOptInChimeraActivity.this;
                            if (!stream.anyMatch(new Predicate() { // from class: djme
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo463negate() {
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
                                djlv.b(backupOptInChimeraActivity2, R.string.common_something_went_wrong, backupOptInChimeraActivity2.v);
                            } else {
                                BackupOptInChimeraActivity.j.j("Connected to supplied nodeId, fetching accounts from the watch", new Object[0]);
                                dfaq g = backupOptInChimeraActivity2.s.g(backupOptInChimeraActivity2.q);
                                g.z(new dfak() { // from class: djmf
                                    @Override // defpackage.dfak
                                    public final void gn(Object obj3) {
                                        BackupOptInChimeraActivity.this.k((dlul) obj3);
                                    }
                                });
                                g.y(new dfah() { // from class: djmg
                                    @Override // defpackage.dfah
                                    public final void gm(Exception exc) {
                                        BackupOptInChimeraActivity.j.g("Failed to get backup status", exc, new Object[0]);
                                        BackupOptInChimeraActivity backupOptInChimeraActivity3 = BackupOptInChimeraActivity.this;
                                        djlv.b(backupOptInChimeraActivity3, R.string.companion_backup_status_fetch_error_dialog_title, backupOptInChimeraActivity3.v);
                                    }
                                });
                            }
                        }
                    });
                    bk.y(new dfah() { // from class: djmd
                        @Override // defpackage.dfah
                        public final void gm(Exception exc) {
                            BackupOptInChimeraActivity.j.g("Failed to get connected nodes", exc, new Object[0]);
                            BackupOptInChimeraActivity backupOptInChimeraActivity2 = BackupOptInChimeraActivity.this;
                            djlv.b(backupOptInChimeraActivity2, R.string.common_something_went_wrong, backupOptInChimeraActivity2.v);
                        }
                    });
                }
                LinearLayout linearLayout = (LinearLayout) backupOptInChimeraActivity.findViewById(R.id.header);
                dkbd.g(linearLayout, appTheme, (TextView) linearLayout.findViewById(R.id.title));
                djli.a((TextView) backupOptInChimeraActivity.findViewById(R.id.storage_body));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("node_id", this.q);
        bundle.putString("account_name", this.r);
        bundle.putString("calling_package", this.w);
        super.onSaveInstanceState(bundle);
    }
}
