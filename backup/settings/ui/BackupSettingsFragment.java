package com.google.android.gms.backup.settings.ui;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;
import com.google.android.gms.R;
import com.google.android.gms.backup.common.util.session.ParcelableSession;
import com.google.android.gms.backup.settings.component.PhotosEnablementSnackbarInfo;
import com.google.android.gms.backup.settings.ui.BackupSettingsFragment;
import com.google.android.gms.backup.settings.ui.BackupStateTogglePreference;
import com.google.android.gms.chimera.modules.backup.settings.AppContextProvider;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.ajqj;
import defpackage.ajrv;
import defpackage.ajtu;
import defpackage.ajtv;
import defpackage.ajtx;
import defpackage.ajwg;
import defpackage.ajwh;
import defpackage.ajxi;
import defpackage.akaq;
import defpackage.akar;
import defpackage.akdo;
import defpackage.akfm;
import defpackage.akfp;
import defpackage.aljq;
import defpackage.almc;
import defpackage.almd;
import defpackage.alrv;
import defpackage.alxp;
import defpackage.alyo;
import defpackage.alyp;
import defpackage.alyq;
import defpackage.alys;
import defpackage.alzl;
import defpackage.alzp;
import defpackage.amao;
import defpackage.athr;
import defpackage.aupz;
import defpackage.dhlk;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.emyt;
import defpackage.eqgo;
import defpackage.euyj;
import defpackage.euyl;
import defpackage.evlx;
import defpackage.evmc;
import defpackage.evmd;
import defpackage.evmp;
import defpackage.evmq;
import defpackage.evne;
import defpackage.evnf;
import defpackage.evnz;
import defpackage.evoa;
import defpackage.evoe;
import defpackage.evog;
import defpackage.evoh;
import defpackage.evoi;
import defpackage.fgrc;
import defpackage.foda;
import defpackage.fodd;
import defpackage.fofw;
import defpackage.fogc;
import defpackage.mdz;
import defpackage.mea;
import defpackage.meg;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BackupSettingsFragment extends alzp {
    private Preference aK;
    private StorageMeterPreference aL;
    private final ekww aM;
    private boolean aN;
    public PhotosPreference ag;
    public DollyBackupPreference ah;
    public DollyBackupPreference ai;
    public DollyBackupPreference aj;
    public AppsBackupPreference ak;
    public Preference al;
    public BackupNowPreference am;
    public ManageStoragePreference an;
    public SwitchPreference ao;
    public final eqgo ap = new aupz(1, 9);
    public final boolean aq;
    public final long ar;
    public final ekww as;
    public final ajtv at;
    public boolean au;
    public BackupStateTogglePreference d;

    public BackupSettingsFragment() {
        this.aq = Build.VERSION.SDK_INT >= 24 && foda.k();
        this.ar = fodd.e() * 3600000;
        this.as = ekxd.a(new ekww() { // from class: alyf
            @Override // defpackage.ekww
            public final Object lK() {
                return Boolean.valueOf(fodd.w());
            }
        });
        this.aM = ekxd.a(new ekww() { // from class: alyg
            @Override // defpackage.ekww
            public final Object lK() {
                return Boolean.valueOf(fofq.i());
            }
        });
        AppContextProvider appContextProvider = AppContextProvider.c;
        this.at = new ajtv(appContextProvider == null ? athr.a() : appContextProvider.a);
    }

    public static final void W(StringBuilder sb) {
        sb.append("<br>");
    }

    private final CharSequence aj(String str) {
        return requireContext().getString(R.string.ebnr_photos_snackbar_success_text, str);
    }

    @Override // defpackage.mem
    public final void C(Bundle bundle, String str) {
        ekww ekwwVar = this.aM;
        if (((Boolean) ekwwVar.lK()).booleanValue()) {
            A(R.xml.backup_settings_with_photos_v2);
        } else {
            A(R.xml.backup_settings);
        }
        PreferenceScreen z = z();
        this.an = (ManageStoragePreference) z.l("manage_storage_preference");
        this.aL = (StorageMeterPreference) z.l("storage_meter");
        BackupStateTogglePreference backupStateTogglePreference = (BackupStateTogglePreference) z.l("backup_state_toggle");
        this.d = backupStateTogglePreference;
        backupStateTogglePreference.k(ab());
        this.d.n = new alyo(this);
        BackupNowPreference backupNowPreference = (BackupNowPreference) z.l("backup_now_preference");
        this.am = backupNowPreference;
        backupNowPreference.k(this.aC);
        M().o = this;
        this.aB = UUID.randomUUID().toString();
        this.aA = new alzl(this);
        PreferenceCategory preferenceCategory = (PreferenceCategory) z.l("backup_content_group");
        this.ag = (PhotosPreference) preferenceCategory.l(true != ((Boolean) ekwwVar.lK()).booleanValue() ? "photos" : "photos_v2");
        this.ak = (AppsBackupPreference) preferenceCategory.l("apps");
        this.ah = (DollyBackupPreference) preferenceCategory.l("callhistory");
        this.ai = (DollyBackupPreference) preferenceCategory.l("devicesettings");
        this.aj = (DollyBackupPreference) preferenceCategory.l("sms");
        this.al = preferenceCategory.l("sync_settings");
        Context context = getContext();
        PreferenceCategory preferenceCategory2 = (PreferenceCategory) z.l("advanced_settings_group");
        SwitchPreference switchPreference = (SwitchPreference) preferenceCategory2.l("use_mobile_data_preference");
        this.ao = switchPreference;
        if (this.aq) {
            switchPreference.n = new mdz() { // from class: alyl
                @Override // defpackage.mdz
                public final boolean a(Preference preference, Object obj) {
                    Boolean bool = (Boolean) obj;
                    final boolean booleanValue = bool.booleanValue();
                    Object[] objArr = {bool};
                    BackupSettingsFragment backupSettingsFragment = BackupSettingsFragment.this;
                    backupSettingsFragment.ay.j("Use mobile data: %b", objArr);
                    fgrc v = emwn.a.v();
                    if (booleanValue) {
                        if (!v.b.L()) {
                            v.U();
                        }
                        emwn emwnVar = (emwn) v.b;
                        emwnVar.e = 8;
                        emwnVar.b |= 4;
                    } else {
                        if (!v.b.L()) {
                            v.U();
                        }
                        emwn emwnVar2 = (emwn) v.b;
                        emwnVar2.e = 9;
                        emwnVar2.b |= 4;
                    }
                    alrv.a((emwn) v.Q());
                    final Context applicationContext = backupSettingsFragment.getContext().getApplicationContext();
                    final atpx atpxVar = new atpx(applicationContext, "backup_settings", true);
                    backupSettingsFragment.ap.execute(new Runnable() { // from class: alyh
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z2 = booleanValue;
                            SharedPreferences.Editor edit = atpx.this.edit();
                            edit.putBoolean("use_mobile_data", z2);
                            edit.apply();
                            applicationContext.sendBroadcast(new Intent("com.google.android.gms.backup.ACTION_BACKUP_NETWORK_SETTINGS_CHANGED").setPackage("com.google.android.gms"));
                        }
                    });
                    backupSettingsFragment.R(booleanValue);
                    return true;
                }
            };
            if (fofw.a.lK().i() && context != null && !context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
                this.ao.R(R.string.backup_settings_use_metered_data_preference);
            }
        } else {
            z.ai(preferenceCategory2);
        }
        this.aK = z.l("backup_scheduling_info");
        R(((TwoStatePreference) this.ao).a);
        if (context != null) {
            this.au = new ajtu(context).a().c;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
                this.ay.j("Device does not have telephony feature, removing call logs and SMS items", new Object[0]);
                preferenceCategory.ai(this.ah);
                preferenceCategory.ai(this.aj);
                return;
            }
        }
        this.aj.R(true != this.au ? R.string.data_flavor_sms : R.string.ebnr_save_data_sms_mms);
    }

    @Override // defpackage.alzt
    public final emyt J() {
        return emyt.BACKUP_SETTINGS;
    }

    @Override // defpackage.alzp
    public final BackupNowPreference M() {
        return this.am;
    }

    public final void N(StringBuilder sb, int i) {
        W(sb);
        sb.append("&bull; ");
        sb.append(getString(i));
    }

    public final void O(boolean z, boolean z2) {
        almd almdVar = (almd) getContext();
        if (almdVar != null) {
            almdVar.k(z, z2);
        }
    }

    @Override // defpackage.alzp
    public final void P(evlx evlxVar) {
        ParcelableSession b = ParcelableSession.b();
        evmp evmpVar = (evmp) evmq.a.v();
        fgrc v = evne.a.v();
        euyl euylVar = euyl.ANDROID_BACKUP_SETTING_CHANGE;
        if (!v.b.L()) {
            v.U();
        }
        evne evneVar = (evne) v.b;
        evneVar.c = euylVar.lK;
        evneVar.b |= 1;
        fgrc v2 = evnf.a.v();
        fgrc v3 = evmc.a.v();
        fgrc v4 = evoh.a.v();
        evog evogVar = evog.DISABLED;
        if (!v4.b.L()) {
            v4.U();
        }
        evoh evohVar = (evoh) v4.b;
        evohVar.c = evogVar.d;
        evohVar.b |= 1;
        if (!v3.b.L()) {
            v3.U();
        }
        evmc evmcVar = (evmc) v3.b;
        evoh evohVar2 = (evoh) v4.Q();
        evohVar2.getClass();
        evmcVar.c = evohVar2;
        evmcVar.b |= 1;
        if (!v2.b.L()) {
            v2.U();
        }
        evnf evnfVar = (evnf) v2.b;
        evmc evmcVar2 = (evmc) v3.Q();
        evmcVar2.getClass();
        evnfVar.h = evmcVar2;
        evnfVar.b |= 8;
        evnz evnzVar = (evnz) evoa.a.v();
        evnzVar.a(11);
        if (!v2.b.L()) {
            v2.U();
        }
        evnf evnfVar2 = (evnf) v2.b;
        evoa evoaVar = (evoa) evnzVar.Q();
        evoaVar.getClass();
        evnfVar2.t = evoaVar;
        evnfVar2.d |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        if (!v.b.L()) {
            v.U();
        }
        evne evneVar2 = (evne) v.b;
        evnf evnfVar3 = (evnf) v2.Q();
        evnfVar3.getClass();
        evneVar2.d = evnfVar3;
        evneVar2.b |= 2;
        if (!evmpVar.b.L()) {
            evmpVar.U();
        }
        evmq evmqVar = (evmq) evmpVar.b;
        evne evneVar3 = (evne) v.Q();
        evneVar3.getClass();
        evmqVar.f = evneVar3;
        evmqVar.b |= 4;
        fgrc v5 = evoi.a.v();
        euyj euyjVar = euyj.V;
        if (!v5.b.L()) {
            v5.U();
        }
        evoi evoiVar = (evoi) v5.b;
        evoiVar.c = euyjVar.a();
        evoiVar.b |= 1;
        fgrc v6 = evoe.a.v();
        fgrc v7 = evmd.a.v();
        if (!v7.b.L()) {
            v7.U();
        }
        evmd evmdVar = (evmd) v7.b;
        evlxVar.getClass();
        evmdVar.c = evlxVar;
        evmdVar.b |= 1;
        if (!v6.b.L()) {
            v6.U();
        }
        evoe evoeVar = (evoe) v6.b;
        evmd evmdVar2 = (evmd) v7.Q();
        evmdVar2.getClass();
        evoeVar.g = evmdVar2;
        evoeVar.b |= 16;
        if (!v5.b.L()) {
            v5.U();
        }
        evoi evoiVar2 = (evoi) v5.b;
        evoe evoeVar2 = (evoe) v6.Q();
        evoeVar2.getClass();
        evoiVar2.d = evoeVar2;
        evoiVar2.b |= 8;
        if (!evmpVar.b.L()) {
            evmpVar.U();
        }
        evmq evmqVar2 = (evmq) evmpVar.b;
        evoi evoiVar3 = (evoi) v5.Q();
        evoiVar3.getClass();
        evmqVar2.g = evoiVar3;
        evmqVar2.b |= 8;
        ajxi.d(getContext(), evmpVar, this.aE, b.c()).x(new dhlk() { // from class: alyc
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar) {
                if (dhlwVar.m()) {
                    return;
                }
                BackupSettingsFragment backupSettingsFragment = BackupSettingsFragment.this;
                backupSettingsFragment.ay.g("Exception writing audit record", dhlwVar.h(), new Object[0]);
            }
        });
        alrv.j(3);
        this.aw.f(false);
        this.ax.b(new alyq(this, false));
        akaq a = akar.a();
        a.c(15);
        a.b(b.c());
        final akar a2 = a.a();
        this.ap.execute(new Runnable() { // from class: alyk
            @Override // java.lang.Runnable
            public final void run() {
                final BackupSettingsFragment backupSettingsFragment = BackupSettingsFragment.this;
                Account account = backupSettingsFragment.aE;
                String str = account != null ? account.name : null;
                backupSettingsFragment.at.a.d(str, a2);
                auuv.a(new Runnable() { // from class: alya
                    @Override // java.lang.Runnable
                    public final void run() {
                        BackupSettingsFragment.this.O(false, true);
                    }
                });
            }
        });
    }

    public final void Q() {
        Account account = this.aE;
        if (fogc.d()) {
            StorageMeterPreference storageMeterPreference = this.aL;
            storageMeterPreference.b = akdo.a(account, storageMeterPreference.j);
            storageMeterPreference.k();
            final Intent intent = new Intent();
            if (ajrv.a() && account == null) {
                intent.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.SetBackupAccountFlowActivity");
                intent.putExtra("turnOff", false);
            } else {
                intent.setClassName("com.google.android.gms", "com.google.android.gms.backup.SetBackupAccountActivity");
                intent.putExtra("currentBackupAccount", account);
            }
            this.aL.o = new mea() { // from class: alyj
                @Override // defpackage.mea
                public final boolean b(Preference preference) {
                    BackupSettingsFragment backupSettingsFragment = BackupSettingsFragment.this;
                    String af = backupSettingsFragment.ag.af();
                    Intent intent2 = intent;
                    intent2.putExtra("photosBackupAccountName", af);
                    intent2.putExtra("showConfirmationDialogOnAccountChange", true);
                    backupSettingsFragment.startActivity(intent2);
                    return true;
                }
            };
            this.ax.b(new alxp(account, alxp.c(ajqj.a(getContext(), account), new ajwg(ajwh.a(getContext()), new ajtx(fogc.c()))), new amao(this.aL, this)));
        }
        this.ag.o();
        akfm akfmVar = this.ax;
        Iterator it = this.ag.k(this.aE).iterator();
        while (it.hasNext()) {
            akfmVar.b((akfp) it.next());
        }
        akfmVar.b(new alyp(this));
    }

    public final void R(boolean z) {
        this.aK.P(true != z ? R.string.backup_scheduling_information : R.string.backup_scheduling_information_no_wifi);
    }

    public final void S() {
        Y(new alys() { // from class: alyb
            @Override // defpackage.alys
            public final void a(final Account account) {
                final BackupSettingsFragment backupSettingsFragment = BackupSettingsFragment.this;
                Account account2 = backupSettingsFragment.aE;
                if (account2 != null && account != null && !account2.equals(account)) {
                    BackupStateTogglePreference backupStateTogglePreference = backupSettingsFragment.d;
                    alxv alxvVar = alxv.d;
                    backupStateTogglePreference.ah(alxvVar);
                    backupSettingsFragment.ak.l(alxvVar);
                    backupSettingsFragment.aj.l(alxvVar);
                    backupSettingsFragment.ah.l(alxvVar);
                    backupSettingsFragment.ai.l(alxvVar);
                    backupSettingsFragment.ax.b(new alyq(backupSettingsFragment, true));
                }
                backupSettingsFragment.aE = account;
                if (account == null || !backupSettingsFragment.ab()) {
                    backupSettingsFragment.O(false, false);
                    return;
                }
                ajqm ajqmVar = ajqm.a;
                if (!ajqmVar.l(backupSettingsFragment.getContext()) || !ajqmVar.m(backupSettingsFragment.getContext()) || !ajqmVar.j(backupSettingsFragment.getContext())) {
                    backupSettingsFragment.O(true, false);
                    return;
                }
                backupSettingsFragment.d.k(backupSettingsFragment.ab());
                backupSettingsFragment.al.o = new mea() { // from class: alym
                    @Override // defpackage.mea
                    public final boolean b(Preference preference) {
                        Intent intent = new Intent("android.settings.ACCOUNT_SYNC_SETTINGS");
                        intent.setPackage("com.android.settings");
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("account", account);
                        intent.putExtra(":settings:show_fragment_args", bundle);
                        if (!fofw.a.lK().a()) {
                            intent.setFlags(268435456);
                        }
                        BackupSettingsFragment.this.startActivity(intent);
                        return true;
                    }
                };
                backupSettingsFragment.Q();
                if (backupSettingsFragment.aq && foda.a.lK().A()) {
                    backupSettingsFragment.ax.b(new alyn(backupSettingsFragment));
                }
                new ajla(backupSettingsFragment.getContext()).a().p((ryt) backupSettingsFragment.getContext(), new alzo(backupSettingsFragment));
            }
        });
    }

    @Override // defpackage.alzp
    public final void T() {
        if (this.aE != null) {
            Q();
        }
    }

    @Override // defpackage.alzp
    public final void U(boolean z) {
        if (this.aD == z) {
            return;
        }
        this.aD = z;
        if (z) {
            ProgressBar progressBar = this.aH;
            if (progressBar != null && this.aI != null) {
                progressBar.setVisibility(0);
                this.aI.setVisibility(4);
            }
        } else {
            ProgressBar progressBar2 = this.aH;
            if (progressBar2 != null && this.aI != null) {
                progressBar2.setVisibility(4);
                this.aI.setVisibility(4);
            }
            aljq.a(getContext());
        }
        boolean z2 = !z;
        this.d.H(z2);
        BackupNowPreference backupNowPreference = this.am;
        backupNowPreference.d = z;
        backupNowPreference.l();
        this.aL.H(z2);
    }

    @Override // defpackage.alzp
    public final boolean V() {
        return this.aq && ((TwoStatePreference) this.ao).a;
    }

    public final /* synthetic */ void X(PendingIntent pendingIntent) {
        try {
            pendingIntent.send();
        } catch (PendingIntent.CanceledException e) {
            Toast.makeText(getContext(), R.string.backup_launch_photos_settings_error, 0).show();
            this.ay.e("Failed to send intent", e, new Object[0]);
        }
    }

    @Override // defpackage.alzp, defpackage.alyt, defpackage.alzt, defpackage.mem, defpackage.dg
    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.aN = bundle.getBoolean("photosEnablementSnackbarShown", false);
        }
        super.onCreate(bundle);
    }

    @Override // defpackage.alzp, defpackage.dg
    public final void onResume() {
        final PhotosEnablementSnackbarInfo photosEnablementSnackbarInfo;
        super.onResume();
        S();
        Bundle arguments = getArguments();
        if (arguments == null || (photosEnablementSnackbarInfo = (PhotosEnablementSnackbarInfo) arguments.getParcelable("photosEnablementSnackbarInfo")) == null || this.aN) {
            return;
        }
        if (!photosEnablementSnackbarInfo.d()) {
            if ((photosEnablementSnackbarInfo.b() == null) == (photosEnablementSnackbarInfo.a() == null)) {
                this.ay.m("Photos enablement error snackbar received incorrect intent state", new Object[0]);
                Z(getContext().getString(R.string.ebnr_photos_snackbar_error_text));
                alrv.h(3);
            } else if (photosEnablementSnackbarInfo.b() != null) {
                this.ay.j("Showing Photos enablement error snackbar with Photos alley-oop intent", new Object[0]);
                aa(getContext().getString(R.string.ebnr_photos_snackbar_error_text), getContext().getString(R.string.ebnr_photos_snackbar_error_button), new View.OnClickListener() { // from class: alyi
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BackupSettingsFragment.this.startActivity(photosEnablementSnackbarInfo.b());
                    }
                });
                alrv.g(3);
            } else if (photosEnablementSnackbarInfo.a() != null) {
                this.ay.j("Showing Photos enablement error snackbar with Photos backup settings intent", new Object[0]);
                String string = getContext().getString(R.string.ebnr_photos_snackbar_error_text);
                String string2 = getContext().getString(R.string.ebnr_photos_snackbar_error_button);
                final PendingIntent a = photosEnablementSnackbarInfo.a();
                aa(string, string2, new View.OnClickListener() { // from class: alye
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BackupSettingsFragment.this.X(a);
                    }
                });
                alrv.g(3);
            }
        } else if (photosEnablementSnackbarInfo.a() != null) {
            this.ay.j("Showing Photos enablement success snackbar", new Object[0]);
            CharSequence aj = aj(photosEnablementSnackbarInfo.c());
            String string3 = getContext().getString(R.string.ebnr_photos_snackbar_success_button);
            final PendingIntent a2 = photosEnablementSnackbarInfo.a();
            aa(aj, string3, new View.OnClickListener() { // from class: alye
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BackupSettingsFragment.this.X(a2);
                }
            });
            alrv.g(2);
        } else {
            this.ay.m("Photos enablement success snackbar missing intent for Photos backup settings", new Object[0]);
            Z(aj(photosEnablementSnackbarInfo.c()));
            alrv.h(2);
        }
        this.aN = true;
    }

    @Override // defpackage.mem, defpackage.dg
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("photosEnablementSnackbarShown", this.aN);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.alzp, defpackage.mem, defpackage.dg
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("scrollPreferenceKey")) == null) {
            return;
        }
        meg megVar = new meg(this, string);
        if (this.b == null) {
            this.c = megVar;
        } else {
            megVar.run();
        }
        if (getContext() instanceof almc) {
            ((almc) getContext()).f();
        }
    }
}
