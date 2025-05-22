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
import defpackage.atad;
import defpackage.auad;
import defpackage.dlwv;
import defpackage.dlxa;
import defpackage.dlxc;
import defpackage.dlxi;
import defpackage.dlzp;
import defpackage.dmcp;
import defpackage.dofz;
import defpackage.dohj;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgrr;
import defpackage.fgub;
import defpackage.rxx;
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

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BackupSettingsChimeraActivity extends rxx {
    public static final auad j = new dlxc("BackupSettingsActivity");
    public static final dohj k;
    static final Optional l;
    static final Optional m;
    static final Optional n;
    static final Optional o;
    static final Optional p;
    public String q;
    public String r;
    public dlzp s;
    public dlwv t;
    public ConstraintLayout u;
    public AppTheme v;
    public String w;
    public dmcp x;
    public atad y;

    static {
        fgrc v = dohj.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        dohj dohjVar = (dohj) fgriVar;
        dohjVar.b |= 1;
        dohjVar.c = 251864004;
        if (!fgriVar.L()) {
            v.U();
        }
        dohj dohjVar2 = (dohj) v.b;
        fgrr fgrrVar = dohjVar2.d;
        if (!fgrrVar.c()) {
            dohjVar2.d = fgri.C(fgrrVar);
        }
        dohjVar2.d.i(R.string.backup_toggle_label);
        if (!v.b.L()) {
            v.U();
        }
        dohj dohjVar3 = (dohj) v.b;
        fgrr fgrrVar2 = dohjVar3.e;
        if (!fgrrVar2.c()) {
            dohjVar3.e = fgri.C(fgrrVar2);
        }
        dohjVar3.e.i(R.string.backup_opt_out_dialog_title);
        if (!v.b.L()) {
            v.U();
        }
        dohj dohjVar4 = (dohj) v.b;
        fgrr fgrrVar3 = dohjVar4.f;
        if (!fgrrVar3.c()) {
            dohjVar4.f = fgri.C(fgrrVar3);
        }
        dohjVar4.f.i(R.string.backup_opt_out_dialog_body);
        if (!v.b.L()) {
            v.U();
        }
        dohj dohjVar5 = (dohj) v.b;
        fgrr fgrrVar4 = dohjVar5.g;
        if (!fgrrVar4.c()) {
            dohjVar5.g = fgri.C(fgrrVar4);
        }
        dohjVar5.g.i(R.string.companion_backup_opt_out_dialog_confirmation_label);
        if (!v.b.L()) {
            v.U();
        }
        dohj dohjVar6 = (dohj) v.b;
        fgrr fgrrVar5 = dohjVar6.h;
        if (!fgrrVar5.c()) {
            dohjVar6.h = fgri.C(fgrrVar5);
        }
        dohjVar6.h.i(R.string.common_cancel);
        k = (dohj) v.Q();
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
        if ((((dofz) optional.get()).b & 8) == 0) {
            j.j("Watch has not backed up", new Object[0]);
            String string2 = getString(R.string.companion_backup_no_data_backed_up);
            textView.setText(string2);
            textView2.setText(string2);
            textView3.setText(string2);
            textView4.setText(getString(R.string.companion_backup_overall_stats_format, new Object[]{this.r, string2}));
            return;
        }
        j.j("Watch has backed up, showing backup stats", new Object[0]);
        dofz dofzVar = (dofz) optional.get();
        textView.setText(dlxa.b(this, dofzVar.c));
        textView2.setText(dlxa.b(this, dofzVar.d));
        textView3.setText(dlxa.b(this, dofzVar.e));
        String str = this.r;
        fgub fgubVar = dofzVar.f;
        if (fgubVar == null) {
            fgubVar = fgub.a;
        }
        textView4.setText(getString(R.string.companion_backup_overall_stats_format, new Object[]{str, DateUtils.getRelativeDateTimeString(this, fgubVar.b * 1000, 60000L, 604800000L, 0).toString()}));
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
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
        dlxi dlxiVar = (dlxi) p.orElseGet(new Supplier() { // from class: dlyx
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dlxi(dlwl.d(BackupSettingsChimeraActivity.this));
            }
        });
        if (optional.isEmpty()) {
            j.f("Provided node_id extra was null", new Object[0]);
            dlxiVar.a(this.w, new Consumer() { // from class: dlzf
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    BackupSettingsChimeraActivity backupSettingsChimeraActivity = BackupSettingsChimeraActivity.this;
                    AppTheme appTheme = (AppTheme) obj;
                    dmmw.f(appTheme, backupSettingsChimeraActivity.getIntent(), backupSettingsChimeraActivity);
                    dlxo.b(backupSettingsChimeraActivity, R.string.common_something_went_wrong, appTheme);
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
        this.s = (dlzp) l.orElseGet(new Supplier() { // from class: dlzg
            @Override // java.util.function.Supplier
            public final Object get() {
                return dlzo.a(BackupSettingsChimeraActivity.this);
            }
        });
        this.y = (atad) m.orElseGet(new Supplier() { // from class: dlzh
            @Override // java.util.function.Supplier
            public final Object get() {
                return dlwl.f(BackupSettingsChimeraActivity.this);
            }
        });
        this.x = (dmcp) n.orElseGet(new Supplier() { // from class: dlzi
            @Override // java.util.function.Supplier
            public final Object get() {
                BackupSettingsChimeraActivity backupSettingsChimeraActivity = BackupSettingsChimeraActivity.this;
                BluetoothManager bluetoothManager = (BluetoothManager) backupSettingsChimeraActivity.getSystemService(BluetoothManager.class);
                ekvl.y(bluetoothManager);
                return new dmcp(bluetoothManager.getAdapter(), dlwl.f(backupSettingsChimeraActivity));
            }
        });
        this.t = (dlwv) o.orElseGet(new Supplier() { // from class: dlzj
            @Override // java.util.function.Supplier
            public final Object get() {
                return dlwy.b(BackupSettingsChimeraActivity.this);
            }
        });
        dlxiVar.a(this.w, new Consumer() { // from class: dlzk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                final BackupSettingsChimeraActivity backupSettingsChimeraActivity = BackupSettingsChimeraActivity.this;
                AppTheme appTheme = (AppTheme) obj;
                backupSettingsChimeraActivity.v = appTheme;
                dmmw.f(appTheme, backupSettingsChimeraActivity.getIntent(), backupSettingsChimeraActivity);
                backupSettingsChimeraActivity.setContentView(dmmw.c(appTheme, backupSettingsChimeraActivity.getLayoutInflater()).inflate(R.layout.companion_backup_settings_activity, (ViewGroup) null, false));
                dhlw bj = backupSettingsChimeraActivity.y.bj();
                bj.z(new dhlq() { // from class: dlzl
                    @Override // defpackage.dhlq
                    public final void gC(Object obj2) {
                        Stream stream = Collection.EL.stream((List) obj2);
                        final BackupSettingsChimeraActivity backupSettingsChimeraActivity2 = BackupSettingsChimeraActivity.this;
                        Optional findFirst = stream.filter(new Predicate() { // from class: dlyz
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
                                return ((NodeParcelable) obj3).a.equals(BackupSettingsChimeraActivity.this.q);
                            }
                        }).findFirst();
                        if (!findFirst.isPresent()) {
                            BackupSettingsChimeraActivity.j.f("Supplied nodeId is not connected to this device", new Object[0]);
                            dlxo.b(backupSettingsChimeraActivity2, R.string.common_something_went_wrong, backupSettingsChimeraActivity2.v);
                            return;
                        }
                        backupSettingsChimeraActivity2.r = ((NodeParcelable) findFirst.get()).b;
                        final dmcp dmcpVar = backupSettingsChimeraActivity2.x;
                        final String str2 = backupSettingsChimeraActivity2.q;
                        final dhma dhmaVar = new dhma();
                        Stream map = Collection.EL.stream(dmcpVar.a.getBondedDevices()).map(new Function() { // from class: dmcn
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo479andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                final BluetoothDevice bluetoothDevice = (BluetoothDevice) obj3;
                                dhlw bl = dmcp.this.b.bl(bluetoothDevice.getAddress());
                                final String str3 = str2;
                                final dhma dhmaVar2 = dhmaVar;
                                bl.z(new dhlq() { // from class: dmcm
                                    @Override // defpackage.dhlq
                                    public final void gC(Object obj4) {
                                        String alias;
                                        String str4 = str3;
                                        if (str4.equals((String) obj4)) {
                                            dhma dhmaVar3 = dhmaVar2;
                                            alias = bluetoothDevice.getAlias();
                                            if (TextUtils.isEmpty(alias)) {
                                                dhmaVar3.d(new IllegalStateException("Empty Bluetooth alias for node: ".concat(String.valueOf(str4))));
                                            } else {
                                                dhmaVar3.b(alias);
                                            }
                                        }
                                    }
                                });
                                return bl;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = elgo.d;
                        dhmr.g((elgo) map.collect(elcq.a)).z(new dhlq() { // from class: dmco
                            @Override // defpackage.dhlq
                            public final void gC(Object obj3) {
                                dhma.this.d(new RuntimeException("Unable to find Bluetooth alias for node"));
                            }
                        });
                        dhmf dhmfVar = dhmaVar.a;
                        dhmfVar.z(new dhlq() { // from class: dlyo
                            @Override // defpackage.dhlq
                            public final void gC(Object obj3) {
                                String str3 = (String) obj3;
                                BackupSettingsChimeraActivity.j.j("Got watch Bluetooth alias ".concat(String.valueOf(str3)), new Object[0]);
                                BackupSettingsChimeraActivity.this.r = str3;
                            }
                        });
                        dhmfVar.y(new dhln() { // from class: dlyp
                            @Override // defpackage.dhln
                            public final void gB(Exception exc) {
                                BackupSettingsChimeraActivity.j.g("Failed to get watch Bluetooth alias", exc, new Object[0]);
                            }
                        });
                        dhmfVar.x(new dhlk() { // from class: dlyq
                            @Override // defpackage.dhlk
                            public final void hH(dhlw dhlwVar) {
                                final BackupSettingsChimeraActivity backupSettingsChimeraActivity3 = BackupSettingsChimeraActivity.this;
                                dhlw g = backupSettingsChimeraActivity3.s.g(backupSettingsChimeraActivity3.q);
                                g.z(new dhlq() { // from class: dlzb
                                    @Override // defpackage.dhlq
                                    public final void gC(Object obj3) {
                                        final dogc dogcVar = (dogc) obj3;
                                        final BackupSettingsChimeraActivity backupSettingsChimeraActivity4 = BackupSettingsChimeraActivity.this;
                                        backupSettingsChimeraActivity4.runOnUiThread(new Runnable() { // from class: dlym
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final BackupSettingsChimeraActivity backupSettingsChimeraActivity5 = BackupSettingsChimeraActivity.this;
                                                final dogc dogcVar2 = dogcVar;
                                                if (!dogcVar2.c || (dogcVar2.b & 2) == 0) {
                                                    BackupSettingsChimeraActivity.j.j("Backup not enabled, opening backup opt-in screen", new Object[0]);
                                                    backupSettingsChimeraActivity5.startActivity(BackupOptInChimeraActivity.a(backupSettingsChimeraActivity5.q, null, dogcVar2, backupSettingsChimeraActivity5.w));
                                                    backupSettingsChimeraActivity5.finish();
                                                    return;
                                                }
                                                ((FrameLayout) backupSettingsChimeraActivity5.findViewById(R.id.back_icon_container)).setOnClickListener(new View.OnClickListener() { // from class: dlyr
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        BackupSettingsChimeraActivity.this.finish();
                                                    }
                                                });
                                                LinearLayout linearLayout = (LinearLayout) backupSettingsChimeraActivity5.findViewById(R.id.header);
                                                dmmw.g(linearLayout, backupSettingsChimeraActivity5.v, (TextView) linearLayout.findViewById(R.id.title));
                                                backupSettingsChimeraActivity5.findViewById(R.id.spinner).setVisibility(8);
                                                backupSettingsChimeraActivity5.findViewById(R.id.main_content).setVisibility(0);
                                                final doga dogaVar = dogcVar2.e;
                                                if (dogaVar == null) {
                                                    dogaVar = doga.a;
                                                }
                                                BackupSettingsChimeraActivity.j.j("Showing backup settings UI for account %s", auad.q(dogaVar.c));
                                                ((TextView) backupSettingsChimeraActivity5.findViewById(R.id.account_storage_email)).setText(dogaVar.c);
                                                ((ConstraintLayout) backupSettingsChimeraActivity5.findViewById(R.id.account_storage_picker_section)).setOnClickListener(new View.OnClickListener() { // from class: dlys
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        final BackupSettingsChimeraActivity backupSettingsChimeraActivity6 = BackupSettingsChimeraActivity.this;
                                                        final doga dogaVar2 = dogaVar;
                                                        final dogc dogcVar3 = dogcVar2;
                                                        dlxm.a(backupSettingsChimeraActivity6.getContainerActivity(), dogcVar3.d, backupSettingsChimeraActivity6.t, new dhlq() { // from class: dlyn
                                                            @Override // defpackage.dhlq
                                                            public final void gC(Object obj4) {
                                                                dogb dogbVar = (dogb) obj4;
                                                                if (ekti.e(dogbVar.c, dogaVar2.c)) {
                                                                    return;
                                                                }
                                                                dogc dogcVar4 = dogcVar3;
                                                                BackupSettingsChimeraActivity backupSettingsChimeraActivity7 = BackupSettingsChimeraActivity.this;
                                                                BackupSettingsChimeraActivity.j.j("User chose to change account, opening backup opt-in screen", new Object[0]);
                                                                backupSettingsChimeraActivity7.startActivity(BackupOptInChimeraActivity.a(backupSettingsChimeraActivity7.q, dogbVar.c, dogcVar4, backupSettingsChimeraActivity7.w));
                                                            }
                                                        }, backupSettingsChimeraActivity6.v);
                                                    }
                                                });
                                                backupSettingsChimeraActivity5.u = (ConstraintLayout) backupSettingsChimeraActivity5.findViewById(R.id.bbg1_switch_section);
                                                backupSettingsChimeraActivity5.u.setAccessibilityDelegate(new dlzn(backupSettingsChimeraActivity5));
                                                backupSettingsChimeraActivity5.u.setOnClickListener(new View.OnClickListener() { // from class: dlyt
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        BackupSettingsChimeraActivity.j.j("Backup on-off toggle clicked, showing confirmation pop-up", new Object[0]);
                                                        final BackupSettingsChimeraActivity backupSettingsChimeraActivity6 = BackupSettingsChimeraActivity.this;
                                                        edzp edzpVar = new edzp(dmmw.b(backupSettingsChimeraActivity6, backupSettingsChimeraActivity6.v), R.style.ThemeOverlay_GoogleMaterial3_MaterialAlertDialog_Centered);
                                                        edzpVar.N(backupSettingsChimeraActivity6.getString(R.string.backup_opt_out_dialog_title));
                                                        edzpVar.C(backupSettingsChimeraActivity6.getString(R.string.backup_opt_out_dialog_body));
                                                        edzpVar.z(R.drawable.quantum_gm_ic_error_outline_vd_theme_24);
                                                        edzpVar.L(backupSettingsChimeraActivity6.getString(R.string.companion_backup_opt_out_dialog_confirmation_label), new DialogInterface.OnClickListener() { // from class: dlza
                                                            @Override // android.content.DialogInterface.OnClickListener
                                                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                                                BackupSettingsChimeraActivity.j.j("User confirmed disabling backup", new Object[0]);
                                                                final BackupSettingsChimeraActivity backupSettingsChimeraActivity7 = BackupSettingsChimeraActivity.this;
                                                                final Switch r0 = (Switch) backupSettingsChimeraActivity7.findViewById(R.id.bbg1_switch);
                                                                r0.setEnabled(false);
                                                                backupSettingsChimeraActivity7.u.setClickable(false);
                                                                dhlw a = backupSettingsChimeraActivity7.s.a(backupSettingsChimeraActivity7.q, BackupSettingsChimeraActivity.k);
                                                                a.z(new dhlq() { // from class: dlzd
                                                                    @Override // defpackage.dhlq
                                                                    public final void gC(Object obj4) {
                                                                        BackupSettingsChimeraActivity.j.h("Backup successfully disabled", new Object[0]);
                                                                        BackupSettingsChimeraActivity backupSettingsChimeraActivity8 = BackupSettingsChimeraActivity.this;
                                                                        backupSettingsChimeraActivity8.startActivity(BackupOptInChimeraActivity.a(backupSettingsChimeraActivity8.q, null, null, backupSettingsChimeraActivity8.w));
                                                                        backupSettingsChimeraActivity8.finish();
                                                                    }
                                                                });
                                                                a.y(new dhln() { // from class: dlze
                                                                    @Override // defpackage.dhln
                                                                    public final void gB(Exception exc) {
                                                                        BackupSettingsChimeraActivity.j.g("Failed to disable backup", exc, new Object[0]);
                                                                        r0.setEnabled(true);
                                                                        BackupSettingsChimeraActivity backupSettingsChimeraActivity8 = BackupSettingsChimeraActivity.this;
                                                                        backupSettingsChimeraActivity8.u.setClickable(true);
                                                                        dlxo.c(backupSettingsChimeraActivity8, R.string.companion_backup_turn_off_error_dialog_title, backupSettingsChimeraActivity8.v);
                                                                    }
                                                                });
                                                            }
                                                        });
                                                        edzpVar.F(backupSettingsChimeraActivity6.getString(R.string.common_cancel), null);
                                                        edzpVar.create().show();
                                                    }
                                                });
                                                dhlw f = backupSettingsChimeraActivity5.s.f(backupSettingsChimeraActivity5.q, dogaVar.c);
                                                f.z(new dhlq() { // from class: dlyu
                                                    @Override // defpackage.dhlq
                                                    public final void gC(Object obj4) {
                                                        BackupSettingsChimeraActivity backupSettingsChimeraActivity6 = BackupSettingsChimeraActivity.this;
                                                        dogd dogdVar = (dogd) obj4;
                                                        ((TextView) backupSettingsChimeraActivity6.findViewById(R.id.account_storage_quota_text)).setText(backupSettingsChimeraActivity6.getString(R.string.backup_quota_label, new Object[]{dlxa.a(backupSettingsChimeraActivity6, dogdVar.d), dlxa.b(backupSettingsChimeraActivity6, dogdVar.c)}));
                                                        ((LinearProgressIndicator) backupSettingsChimeraActivity6.findViewById(R.id.account_storage_progress_bar)).g((int) ((dogdVar.d / dogdVar.c) * 100.0d), true);
                                                    }
                                                });
                                                f.y(new dhln() { // from class: dlyv
                                                    @Override // defpackage.dhln
                                                    public final void gB(Exception exc) {
                                                        BackupSettingsChimeraActivity.j.g("Failed to get storage quota data", exc, new Object[0]);
                                                    }
                                                });
                                                backupSettingsChimeraActivity5.a(Optional.empty());
                                                dhlw e = backupSettingsChimeraActivity5.s.e(backupSettingsChimeraActivity5.q);
                                                e.z(new dhlq() { // from class: dlyw
                                                    @Override // defpackage.dhlq
                                                    public final void gC(Object obj4) {
                                                        BackupSettingsChimeraActivity.this.a(Optional.of((dofz) obj4));
                                                    }
                                                });
                                                e.y(new dhln() { // from class: dlyy
                                                    @Override // defpackage.dhln
                                                    public final void gB(Exception exc) {
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
                                g.y(new dhln() { // from class: dlzc
                                    @Override // defpackage.dhln
                                    public final void gB(Exception exc) {
                                        BackupSettingsChimeraActivity.j.g("Failed to get backup status", exc, new Object[0]);
                                        BackupSettingsChimeraActivity backupSettingsChimeraActivity4 = BackupSettingsChimeraActivity.this;
                                        dlxo.b(backupSettingsChimeraActivity4, R.string.companion_backup_status_fetch_error_dialog_title, backupSettingsChimeraActivity4.v);
                                    }
                                });
                            }
                        });
                    }
                });
                bj.y(new dhln() { // from class: dlzm
                    @Override // defpackage.dhln
                    public final void gB(Exception exc) {
                        BackupSettingsChimeraActivity.j.g("Failed to get connected nodes", exc, new Object[0]);
                        BackupSettingsChimeraActivity backupSettingsChimeraActivity2 = BackupSettingsChimeraActivity.this;
                        dlxo.b(backupSettingsChimeraActivity2, R.string.common_something_went_wrong, backupSettingsChimeraActivity2.v);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("node_id", this.q);
        bundle.putString("calling_package", this.w);
        super.onSaveInstanceState(bundle);
    }
}
