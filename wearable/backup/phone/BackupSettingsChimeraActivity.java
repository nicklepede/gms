package com.google.android.gms.wearable.backup.phone;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.R;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.backup.phone.BackupOptInChimeraActivity;
import com.google.android.gms.wearable.backup.phone.BackupSettingsChimeraActivity;
import com.google.android.gms.wearable.internal.NodeParcelable;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import defpackage.aqxo;
import defpackage.arxo;
import defpackage.djlc;
import defpackage.djlh;
import defpackage.djlj;
import defpackage.djlp;
import defpackage.djnw;
import defpackage.djqw;
import defpackage.dlui;
import defpackage.dlvs;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fecy;
import defpackage.fefi;
import defpackage.qet;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BackupSettingsChimeraActivity extends qet {
    public static final arxo j = new djlj("BackupSettingsActivity");
    public static final dlvs k;
    static final Optional l;
    static final Optional m;
    static final Optional n;
    static final Optional o;
    static final Optional p;
    public String q;
    public String r;
    public djnw s;
    public djlc t;
    public ConstraintLayout u;
    public AppTheme v;
    public String w;
    public djqw x;
    public aqxo y;

    static {
        fecj v = dlvs.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        dlvs dlvsVar = (dlvs) fecpVar;
        dlvsVar.b |= 1;
        dlvsVar.c = 251661004;
        if (!fecpVar.L()) {
            v.U();
        }
        dlvs dlvsVar2 = (dlvs) v.b;
        fecy fecyVar = dlvsVar2.d;
        if (!fecyVar.c()) {
            dlvsVar2.d = fecp.C(fecyVar);
        }
        dlvsVar2.d.i(R.string.backup_toggle_label);
        if (!v.b.L()) {
            v.U();
        }
        dlvs dlvsVar3 = (dlvs) v.b;
        fecy fecyVar2 = dlvsVar3.e;
        if (!fecyVar2.c()) {
            dlvsVar3.e = fecp.C(fecyVar2);
        }
        dlvsVar3.e.i(R.string.backup_opt_out_dialog_title);
        if (!v.b.L()) {
            v.U();
        }
        dlvs dlvsVar4 = (dlvs) v.b;
        fecy fecyVar3 = dlvsVar4.f;
        if (!fecyVar3.c()) {
            dlvsVar4.f = fecp.C(fecyVar3);
        }
        dlvsVar4.f.i(R.string.backup_opt_out_dialog_body);
        if (!v.b.L()) {
            v.U();
        }
        dlvs dlvsVar5 = (dlvs) v.b;
        fecy fecyVar4 = dlvsVar5.g;
        if (!fecyVar4.c()) {
            dlvsVar5.g = fecp.C(fecyVar4);
        }
        dlvsVar5.g.i(R.string.companion_backup_opt_out_dialog_confirmation_label);
        if (!v.b.L()) {
            v.U();
        }
        dlvs dlvsVar6 = (dlvs) v.b;
        fecy fecyVar5 = dlvsVar6.h;
        if (!fecyVar5.c()) {
            dlvsVar6.h = fecp.C(fecyVar5);
        }
        dlvsVar6.h.i(R.string.common_cancel);
        k = (dlvs) v.Q();
        l = Optional.empty();
        m = Optional.empty();
        n = Optional.empty();
        o = Optional.empty();
        p = Optional.empty();
    }

    public final void a(Optional optional) {
        TextView textView = (TextView) findViewById(R.id.backup_details_wear_os_bytes);
        TextView textView2 = (TextView) findViewById(R.id.backup_details_settings_bytes);
        TextView textView3 = (TextView) findViewById(R.id.backup_details_apps_bytes);
        TextView textView4 = (TextView) findViewById(R.id.bbg1_overall_stats_text);
        if (optional.isEmpty()) {
            j.j("Still loading backup stats", new Object[0]);
            String string = getString(R.string.companion_backup_loading_stats);
            textView.setText(string);
            textView2.setText(string);
            textView3.setText(string);
            textView4.setText(getString(R.string.companion_backup_overall_stats_format, new Object[]{this.r, string}));
            return;
        }
        if ((((dlui) optional.get()).b & 8) == 0) {
            j.j("Watch has not backed up", new Object[0]);
            String string2 = getString(R.string.companion_backup_no_data_backed_up);
            textView.setText(string2);
            textView2.setText(string2);
            textView3.setText(string2);
            textView4.setText(getString(R.string.companion_backup_overall_stats_format, new Object[]{this.r, string2}));
            return;
        }
        j.j("Watch has backed up, showing backup stats", new Object[0]);
        dlui dluiVar = (dlui) optional.get();
        textView.setText(djlh.b(this, dluiVar.c));
        textView2.setText(djlh.b(this, dluiVar.d));
        textView3.setText(djlh.b(this, dluiVar.e));
        String str = this.r;
        fefi fefiVar = dluiVar.f;
        if (fefiVar == null) {
            fefiVar = fefi.a;
        }
        textView4.setText(getString(R.string.companion_backup_overall_stats_format, new Object[]{str, DateUtils.getRelativeDateTimeString(this, fefiVar.b * 1000, 60000L, 604800000L, 0).toString()}));
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        Optional optional;
        super.onCreate(bundle);
        if (bundle == null) {
            optional = Optional.ofNullable(getIntent().getStringExtra("node_id"));
            this.w = (String) Optional.ofNullable(getCallingPackage()).orElse(getIntent().getStringExtra("calling_package"));
        } else {
            Optional ofNullable = Optional.ofNullable(bundle.getString("node_id"));
            this.w = bundle.getString("calling_package");
            optional = ofNullable;
        }
        djlp djlpVar = (djlp) p.orElseGet(new Supplier() { // from class: djne
            @Override // java.util.function.Supplier
            public final Object get() {
                return new djlp(djks.d(BackupSettingsChimeraActivity.this));
            }
        });
        if (optional.isEmpty()) {
            j.f("Provided node_id extra was null", new Object[0]);
            djlpVar.a(this.w, new Consumer() { // from class: djnm
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    BackupSettingsChimeraActivity backupSettingsChimeraActivity = BackupSettingsChimeraActivity.this;
                    AppTheme appTheme = (AppTheme) obj;
                    dkbd.f(appTheme, backupSettingsChimeraActivity.getIntent(), backupSettingsChimeraActivity);
                    djlv.b(backupSettingsChimeraActivity, R.string.common_something_went_wrong, appTheme);
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
        this.s = (djnw) l.orElseGet(new Supplier() { // from class: djnn
            @Override // java.util.function.Supplier
            public final Object get() {
                return djnv.a(BackupSettingsChimeraActivity.this);
            }
        });
        this.y = (aqxo) m.orElseGet(new Supplier() { // from class: djno
            @Override // java.util.function.Supplier
            public final Object get() {
                return djks.f(BackupSettingsChimeraActivity.this);
            }
        });
        this.x = (djqw) n.orElseGet(new Supplier() { // from class: djnp
            @Override // java.util.function.Supplier
            public final Object get() {
                BackupSettingsChimeraActivity backupSettingsChimeraActivity = BackupSettingsChimeraActivity.this;
                BluetoothManager bluetoothManager = (BluetoothManager) backupSettingsChimeraActivity.getSystemService(BluetoothManager.class);
                eiig.x(bluetoothManager);
                return new djqw(bluetoothManager.getAdapter(), djks.f(backupSettingsChimeraActivity));
            }
        });
        this.t = (djlc) o.orElseGet(new Supplier() { // from class: djnq
            @Override // java.util.function.Supplier
            public final Object get() {
                return djlf.b(BackupSettingsChimeraActivity.this);
            }
        });
        djlpVar.a(this.w, new Consumer() { // from class: djnr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                final BackupSettingsChimeraActivity backupSettingsChimeraActivity = BackupSettingsChimeraActivity.this;
                AppTheme appTheme = (AppTheme) obj;
                backupSettingsChimeraActivity.v = appTheme;
                dkbd.f(appTheme, backupSettingsChimeraActivity.getIntent(), backupSettingsChimeraActivity);
                backupSettingsChimeraActivity.setContentView(dkbd.c(appTheme, backupSettingsChimeraActivity.getLayoutInflater()).inflate(R.layout.companion_backup_settings_activity, (ViewGroup) null, false));
                dfaq bk = backupSettingsChimeraActivity.y.bk();
                bk.z(new dfak() { // from class: djns
                    @Override // defpackage.dfak
                    public final void gn(Object obj2) {
                        Stream stream = Collection.EL.stream((List) obj2);
                        final BackupSettingsChimeraActivity backupSettingsChimeraActivity2 = BackupSettingsChimeraActivity.this;
                        Optional findFirst = stream.filter(new Predicate() { // from class: djng
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
                                return ((NodeParcelable) obj3).a.equals(BackupSettingsChimeraActivity.this.q);
                            }
                        }).findFirst();
                        if (!findFirst.isPresent()) {
                            BackupSettingsChimeraActivity.j.f("Supplied nodeId is not connected to this device", new Object[0]);
                            djlv.b(backupSettingsChimeraActivity2, R.string.common_something_went_wrong, backupSettingsChimeraActivity2.v);
                            return;
                        }
                        backupSettingsChimeraActivity2.r = ((NodeParcelable) findFirst.get()).b;
                        final djqw djqwVar = backupSettingsChimeraActivity2.x;
                        final String str2 = backupSettingsChimeraActivity2.q;
                        final dfau dfauVar = new dfau();
                        Stream map = Collection.EL.stream(djqwVar.a.getBondedDevices()).map(new Function() { // from class: djqu
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo464andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                final BluetoothDevice bluetoothDevice = (BluetoothDevice) obj3;
                                dfaq bm = djqw.this.b.bm(bluetoothDevice.getAddress());
                                final String str3 = str2;
                                final dfau dfauVar2 = dfauVar;
                                bm.z(new dfak() { // from class: djqt
                                    @Override // defpackage.dfak
                                    public final void gn(Object obj4) {
                                        String alias;
                                        String str4 = str3;
                                        if (str4.equals((String) obj4)) {
                                            dfau dfauVar3 = dfauVar2;
                                            alias = bluetoothDevice.getAlias();
                                            if (TextUtils.isEmpty(alias)) {
                                                dfauVar3.d(new IllegalStateException("Empty Bluetooth alias for node: ".concat(String.valueOf(str4))));
                                            } else {
                                                dfauVar3.b(alias);
                                            }
                                        }
                                    }
                                });
                                return bm;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = eitj.d;
                        dfbl.g((eitj) map.collect(eipl.a)).z(new dfak() { // from class: djqv
                            @Override // defpackage.dfak
                            public final void gn(Object obj3) {
                                dfau.this.d(new RuntimeException("Unable to find Bluetooth alias for node"));
                            }
                        });
                        dfaz dfazVar = dfauVar.a;
                        dfazVar.z(new dfak() { // from class: djmv
                            @Override // defpackage.dfak
                            public final void gn(Object obj3) {
                                String str3 = (String) obj3;
                                BackupSettingsChimeraActivity.j.j("Got watch Bluetooth alias ".concat(String.valueOf(str3)), new Object[0]);
                                BackupSettingsChimeraActivity.this.r = str3;
                            }
                        });
                        dfazVar.y(new dfah() { // from class: djmw
                            @Override // defpackage.dfah
                            public final void gm(Exception exc) {
                                BackupSettingsChimeraActivity.j.g("Failed to get watch Bluetooth alias", exc, new Object[0]);
                            }
                        });
                        dfazVar.x(new dfae() { // from class: djmx
                            @Override // defpackage.dfae
                            public final void hr(dfaq dfaqVar) {
                                final BackupSettingsChimeraActivity backupSettingsChimeraActivity3 = BackupSettingsChimeraActivity.this;
                                dfaq g = backupSettingsChimeraActivity3.s.g(backupSettingsChimeraActivity3.q);
                                g.z(new dfak() { // from class: djni
                                    @Override // defpackage.dfak
                                    public final void gn(Object obj3) {
                                        final dlul dlulVar = (dlul) obj3;
                                        final BackupSettingsChimeraActivity backupSettingsChimeraActivity4 = BackupSettingsChimeraActivity.this;
                                        backupSettingsChimeraActivity4.runOnUiThread(new Runnable() { // from class: djmt
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final BackupSettingsChimeraActivity backupSettingsChimeraActivity5 = BackupSettingsChimeraActivity.this;
                                                final dlul dlulVar2 = dlulVar;
                                                if (!dlulVar2.c || (dlulVar2.b & 2) == 0) {
                                                    BackupSettingsChimeraActivity.j.j("Backup not enabled, opening backup opt-in screen", new Object[0]);
                                                    backupSettingsChimeraActivity5.startActivity(BackupOptInChimeraActivity.a(backupSettingsChimeraActivity5.q, null, dlulVar2, backupSettingsChimeraActivity5.w));
                                                    backupSettingsChimeraActivity5.finish();
                                                    return;
                                                }
                                                ((FrameLayout) backupSettingsChimeraActivity5.findViewById(R.id.back_icon_container)).setOnClickListener(new View.OnClickListener() { // from class: djmy
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        BackupSettingsChimeraActivity.this.finish();
                                                    }
                                                });
                                                LinearLayout linearLayout = (LinearLayout) backupSettingsChimeraActivity5.findViewById(R.id.header);
                                                dkbd.g(linearLayout, backupSettingsChimeraActivity5.v, (TextView) linearLayout.findViewById(R.id.title));
                                                backupSettingsChimeraActivity5.findViewById(R.id.spinner).setVisibility(8);
                                                backupSettingsChimeraActivity5.findViewById(R.id.main_content).setVisibility(0);
                                                final dluj dlujVar = dlulVar2.e;
                                                if (dlujVar == null) {
                                                    dlujVar = dluj.a;
                                                }
                                                BackupSettingsChimeraActivity.j.j("Showing backup settings UI for account %s", arxo.q(dlujVar.c));
                                                ((TextView) backupSettingsChimeraActivity5.findViewById(R.id.account_storage_email)).setText(dlujVar.c);
                                                ((ConstraintLayout) backupSettingsChimeraActivity5.findViewById(R.id.account_storage_picker_section)).setOnClickListener(new View.OnClickListener() { // from class: djmz
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        final BackupSettingsChimeraActivity backupSettingsChimeraActivity6 = BackupSettingsChimeraActivity.this;
                                                        final dluj dlujVar2 = dlujVar;
                                                        final dlul dlulVar3 = dlulVar2;
                                                        djlt.a(backupSettingsChimeraActivity6.getContainerActivity(), dlulVar3.d, backupSettingsChimeraActivity6.t, new dfak() { // from class: djmu
                                                            @Override // defpackage.dfak
                                                            public final void gn(Object obj4) {
                                                                dluk dlukVar = (dluk) obj4;
                                                                if (eigd.e(dlukVar.c, dlujVar2.c)) {
                                                                    return;
                                                                }
                                                                dlul dlulVar4 = dlulVar3;
                                                                BackupSettingsChimeraActivity backupSettingsChimeraActivity7 = BackupSettingsChimeraActivity.this;
                                                                BackupSettingsChimeraActivity.j.j("User chose to change account, opening backup opt-in screen", new Object[0]);
                                                                backupSettingsChimeraActivity7.startActivity(BackupOptInChimeraActivity.a(backupSettingsChimeraActivity7.q, dlukVar.c, dlulVar4, backupSettingsChimeraActivity7.w));
                                                            }
                                                        }, backupSettingsChimeraActivity6.v);
                                                    }
                                                });
                                                backupSettingsChimeraActivity5.u = (ConstraintLayout) backupSettingsChimeraActivity5.findViewById(R.id.bbg1_switch_section);
                                                backupSettingsChimeraActivity5.u.setAccessibilityDelegate(new djnu(backupSettingsChimeraActivity5));
                                                backupSettingsChimeraActivity5.u.setOnClickListener(new View.OnClickListener() { // from class: djna
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        BackupSettingsChimeraActivity.j.j("Backup on-off toggle clicked, showing confirmation pop-up", new Object[0]);
                                                        final BackupSettingsChimeraActivity backupSettingsChimeraActivity6 = BackupSettingsChimeraActivity.this;
                                                        ebna ebnaVar = new ebna(dkbd.b(backupSettingsChimeraActivity6, backupSettingsChimeraActivity6.v), R.style.ThemeOverlay_GoogleMaterial3_MaterialAlertDialog_Centered);
                                                        ebnaVar.N(backupSettingsChimeraActivity6.getString(R.string.backup_opt_out_dialog_title));
                                                        ebnaVar.C(backupSettingsChimeraActivity6.getString(R.string.backup_opt_out_dialog_body));
                                                        ebnaVar.z(R.drawable.quantum_gm_ic_error_outline_vd_theme_24);
                                                        ebnaVar.L(backupSettingsChimeraActivity6.getString(R.string.companion_backup_opt_out_dialog_confirmation_label), new DialogInterface.OnClickListener() { // from class: djnh
                                                            @Override // android.content.DialogInterface.OnClickListener
                                                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                                                BackupSettingsChimeraActivity.j.j("User confirmed disabling backup", new Object[0]);
                                                                final BackupSettingsChimeraActivity backupSettingsChimeraActivity7 = BackupSettingsChimeraActivity.this;
                                                                final Switch r0 = (Switch) backupSettingsChimeraActivity7.findViewById(R.id.bbg1_switch);
                                                                r0.setEnabled(false);
                                                                backupSettingsChimeraActivity7.u.setClickable(false);
                                                                dfaq a = backupSettingsChimeraActivity7.s.a(backupSettingsChimeraActivity7.q, BackupSettingsChimeraActivity.k);
                                                                a.z(new dfak() { // from class: djnk
                                                                    @Override // defpackage.dfak
                                                                    public final void gn(Object obj4) {
                                                                        BackupSettingsChimeraActivity.j.h("Backup successfully disabled", new Object[0]);
                                                                        BackupSettingsChimeraActivity backupSettingsChimeraActivity8 = BackupSettingsChimeraActivity.this;
                                                                        backupSettingsChimeraActivity8.startActivity(BackupOptInChimeraActivity.a(backupSettingsChimeraActivity8.q, null, null, backupSettingsChimeraActivity8.w));
                                                                        backupSettingsChimeraActivity8.finish();
                                                                    }
                                                                });
                                                                a.y(new dfah() { // from class: djnl
                                                                    @Override // defpackage.dfah
                                                                    public final void gm(Exception exc) {
                                                                        BackupSettingsChimeraActivity.j.g("Failed to disable backup", exc, new Object[0]);
                                                                        r0.setEnabled(true);
                                                                        BackupSettingsChimeraActivity backupSettingsChimeraActivity8 = BackupSettingsChimeraActivity.this;
                                                                        backupSettingsChimeraActivity8.u.setClickable(true);
                                                                        djlv.c(backupSettingsChimeraActivity8, R.string.companion_backup_turn_off_error_dialog_title, backupSettingsChimeraActivity8.v);
                                                                    }
                                                                });
                                                            }
                                                        });
                                                        ebnaVar.F(backupSettingsChimeraActivity6.getString(R.string.common_cancel), null);
                                                        ebnaVar.create().show();
                                                    }
                                                });
                                                dfaq f = backupSettingsChimeraActivity5.s.f(backupSettingsChimeraActivity5.q, dlujVar.c);
                                                f.z(new dfak() { // from class: djnb
                                                    @Override // defpackage.dfak
                                                    public final void gn(Object obj4) {
                                                        BackupSettingsChimeraActivity backupSettingsChimeraActivity6 = BackupSettingsChimeraActivity.this;
                                                        dlum dlumVar = (dlum) obj4;
                                                        ((TextView) backupSettingsChimeraActivity6.findViewById(R.id.account_storage_quota_text)).setText(backupSettingsChimeraActivity6.getString(R.string.backup_quota_label, new Object[]{djlh.a(backupSettingsChimeraActivity6, dlumVar.d), djlh.b(backupSettingsChimeraActivity6, dlumVar.c)}));
                                                        ((LinearProgressIndicator) backupSettingsChimeraActivity6.findViewById(R.id.account_storage_progress_bar)).g((int) ((dlumVar.d / dlumVar.c) * 100.0d), true);
                                                    }
                                                });
                                                f.y(new dfah() { // from class: djnc
                                                    @Override // defpackage.dfah
                                                    public final void gm(Exception exc) {
                                                        BackupSettingsChimeraActivity.j.g("Failed to get storage quota data", exc, new Object[0]);
                                                    }
                                                });
                                                backupSettingsChimeraActivity5.a(Optional.empty());
                                                dfaq e = backupSettingsChimeraActivity5.s.e(backupSettingsChimeraActivity5.q);
                                                e.z(new dfak() { // from class: djnd
                                                    @Override // defpackage.dfak
                                                    public final void gn(Object obj4) {
                                                        BackupSettingsChimeraActivity.this.a(Optional.of((dlui) obj4));
                                                    }
                                                });
                                                e.y(new dfah() { // from class: djnf
                                                    @Override // defpackage.dfah
                                                    public final void gm(Exception exc) {
                                                        BackupSettingsChimeraActivity.j.g("Failed to get size and time stats data", exc, new Object[0]);
                                                        BackupSettingsChimeraActivity backupSettingsChimeraActivity6 = BackupSettingsChimeraActivity.this;
                                                        backupSettingsChimeraActivity6.findViewById(R.id.backup_details_section).setVisibility(8);
                                                        ((TextView) backupSettingsChimeraActivity6.findViewById(R.id.bbg1_overall_stats_text)).setText(R.string.backup_size_and_time_stats_error);
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                                g.y(new dfah() { // from class: djnj
                                    @Override // defpackage.dfah
                                    public final void gm(Exception exc) {
                                        BackupSettingsChimeraActivity.j.g("Failed to get backup status", exc, new Object[0]);
                                        BackupSettingsChimeraActivity backupSettingsChimeraActivity4 = BackupSettingsChimeraActivity.this;
                                        djlv.b(backupSettingsChimeraActivity4, R.string.companion_backup_status_fetch_error_dialog_title, backupSettingsChimeraActivity4.v);
                                    }
                                });
                            }
                        });
                    }
                });
                bk.y(new dfah() { // from class: djnt
                    @Override // defpackage.dfah
                    public final void gm(Exception exc) {
                        BackupSettingsChimeraActivity.j.g("Failed to get connected nodes", exc, new Object[0]);
                        BackupSettingsChimeraActivity backupSettingsChimeraActivity2 = BackupSettingsChimeraActivity.this;
                        djlv.b(backupSettingsChimeraActivity2, R.string.common_something_went_wrong, backupSettingsChimeraActivity2.v);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("node_id", this.q);
        bundle.putString("calling_package", this.w);
        super.onSaveInstanceState(bundle);
    }
}
