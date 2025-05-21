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
import com.google.android.gms.backup.settings.ui.AppsBackupPreference;
import com.google.android.gms.backup.settings.ui.BackupSettingsFragment;
import com.google.android.gms.chimera.modules.backup.settings.AppContextProvider;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.ahpt;
import defpackage.ahrf;
import defpackage.ahte;
import defpackage.ahtf;
import defpackage.ahth;
import defpackage.ahvq;
import defpackage.ahvr;
import defpackage.ahws;
import defpackage.aiaa;
import defpackage.aiab;
import defpackage.aicy;
import defpackage.aiew;
import defpackage.aiez;
import defpackage.ajiy;
import defpackage.ajlk;
import defpackage.ajll;
import defpackage.ajrc;
import defpackage.ajwr;
import defpackage.ajxq;
import defpackage.ajxr;
import defpackage.ajxs;
import defpackage.ajxu;
import defpackage.ajyn;
import defpackage.ajyr;
import defpackage.ajzq;
import defpackage.arfc;
import defpackage.asmf;
import defpackage.dfae;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.eklh;
import defpackage.ensv;
import defpackage.esiu;
import defpackage.esiw;
import defpackage.eswh;
import defpackage.eswm;
import defpackage.eswn;
import defpackage.eswz;
import defpackage.esxa;
import defpackage.esxo;
import defpackage.esxp;
import defpackage.esyj;
import defpackage.esyk;
import defpackage.esyo;
import defpackage.esyq;
import defpackage.esyr;
import defpackage.esys;
import defpackage.fecj;
import defpackage.fllq;
import defpackage.fllt;
import defpackage.flom;
import defpackage.flos;
import defpackage.klo;
import defpackage.klp;
import defpackage.klv;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BackupSettingsFragment extends ajyr {
    private Preference aK;
    private StorageMeterPreference aL;
    private final eijr aM;
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
    public final ensv ap = new asmf(1, 9);
    public final boolean aq;
    public final long ar;
    public final eijr as;
    public final ahtf at;
    public boolean au;
    public BackupStateTogglePreference d;

    public BackupSettingsFragment() {
        this.aq = Build.VERSION.SDK_INT >= 24 && fllq.k();
        this.ar = fllt.e() * 3600000;
        this.as = eijy.a(new eijr() { // from class: ajxh
            @Override // defpackage.eijr
            public final Object a() {
                return Boolean.valueOf(fllt.w());
            }
        });
        this.aM = eijy.a(new eijr() { // from class: ajxi
            @Override // defpackage.eijr
            public final Object a() {
                return Boolean.valueOf(flog.i());
            }
        });
        AppContextProvider appContextProvider = AppContextProvider.c;
        this.at = new ahtf(appContextProvider == null ? arfc.a() : appContextProvider.a);
    }

    public static final void W(StringBuilder sb) {
        sb.append("<br>");
    }

    private final CharSequence aj(String str) {
        return requireContext().getString(R.string.ebnr_photos_snackbar_success_text, str);
    }

    @Override // defpackage.kmb
    public final void C(Bundle bundle, String str) {
        eijr eijrVar = this.aM;
        if (((Boolean) eijrVar.a()).booleanValue()) {
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
        this.d.n = new ajxq(this);
        BackupNowPreference backupNowPreference = (BackupNowPreference) z.l("backup_now_preference");
        this.am = backupNowPreference;
        backupNowPreference.k(this.aC);
        M().o = this;
        this.aB = UUID.randomUUID().toString();
        this.aA = new ajyn(this);
        PreferenceCategory preferenceCategory = (PreferenceCategory) z.l("backup_content_group");
        this.ag = (PhotosPreference) preferenceCategory.l(true != ((Boolean) eijrVar.a()).booleanValue() ? "photos" : "photos_v2");
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
            switchPreference.n = new klo() { // from class: ajxn
                @Override // defpackage.klo
                public final boolean a(Preference preference, Object obj) {
                    Boolean bool = (Boolean) obj;
                    final boolean booleanValue = bool.booleanValue();
                    Object[] objArr = {bool};
                    BackupSettingsFragment backupSettingsFragment = BackupSettingsFragment.this;
                    backupSettingsFragment.ay.j("Use mobile data: %b", objArr);
                    fecj v = ekjb.a.v();
                    if (booleanValue) {
                        if (!v.b.L()) {
                            v.U();
                        }
                        ekjb ekjbVar = (ekjb) v.b;
                        ekjbVar.e = 8;
                        ekjbVar.b |= 4;
                    } else {
                        if (!v.b.L()) {
                            v.U();
                        }
                        ekjb ekjbVar2 = (ekjb) v.b;
                        ekjbVar2.e = 9;
                        ekjbVar2.b |= 4;
                    }
                    ajrc.a((ekjb) v.Q());
                    final Context applicationContext = backupSettingsFragment.getContext().getApplicationContext();
                    final arni arniVar = new arni(applicationContext, "backup_settings", true);
                    backupSettingsFragment.ap.execute(new Runnable() { // from class: ajxj
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z2 = booleanValue;
                            SharedPreferences.Editor edit = arni.this.edit();
                            edit.putBoolean("use_mobile_data", z2);
                            edit.apply();
                            applicationContext.sendBroadcast(new Intent("com.google.android.gms.backup.ACTION_BACKUP_NETWORK_SETTINGS_CHANGED").setPackage("com.google.android.gms"));
                        }
                    });
                    backupSettingsFragment.R(booleanValue);
                    return true;
                }
            };
            if (flom.a.a().i() && context != null && !context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
                this.ao.R(R.string.backup_settings_use_metered_data_preference);
            }
        } else {
            z.ai(preferenceCategory2);
        }
        this.aK = z.l("backup_scheduling_info");
        R(((TwoStatePreference) this.ao).a);
        if (context != null) {
            this.au = new ahte(context).a().c;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
                this.ay.j("Device does not have telephony feature, removing call logs and SMS items", new Object[0]);
                preferenceCategory.ai(this.ah);
                preferenceCategory.ai(this.aj);
                return;
            }
        }
        this.aj.R(true != this.au ? R.string.data_flavor_sms : R.string.ebnr_save_data_sms_mms);
    }

    @Override // defpackage.ajyv
    public final eklh J() {
        return eklh.BACKUP_SETTINGS;
    }

    @Override // defpackage.ajyr
    public final BackupNowPreference M() {
        return this.am;
    }

    public final void N(StringBuilder sb, int i) {
        W(sb);
        sb.append("&bull; ");
        sb.append(getString(i));
    }

    public final void O(boolean z, boolean z2) {
        ajll ajllVar = (ajll) getContext();
        if (ajllVar != null) {
            ajllVar.k(z, z2);
        }
    }

    @Override // defpackage.ajyr
    public final void P(eswh eswhVar) {
        ParcelableSession b = ParcelableSession.b();
        eswz eswzVar = (eswz) esxa.a.v();
        fecj v = esxo.a.v();
        esiw esiwVar = esiw.ANDROID_BACKUP_SETTING_CHANGE;
        if (!v.b.L()) {
            v.U();
        }
        esxo esxoVar = (esxo) v.b;
        esxoVar.c = esiwVar.lF;
        esxoVar.b |= 1;
        fecj v2 = esxp.a.v();
        fecj v3 = eswm.a.v();
        fecj v4 = esyr.a.v();
        esyq esyqVar = esyq.DISABLED;
        if (!v4.b.L()) {
            v4.U();
        }
        esyr esyrVar = (esyr) v4.b;
        esyrVar.c = esyqVar.d;
        esyrVar.b |= 1;
        if (!v3.b.L()) {
            v3.U();
        }
        eswm eswmVar = (eswm) v3.b;
        esyr esyrVar2 = (esyr) v4.Q();
        esyrVar2.getClass();
        eswmVar.c = esyrVar2;
        eswmVar.b |= 1;
        if (!v2.b.L()) {
            v2.U();
        }
        esxp esxpVar = (esxp) v2.b;
        eswm eswmVar2 = (eswm) v3.Q();
        eswmVar2.getClass();
        esxpVar.h = eswmVar2;
        esxpVar.b |= 8;
        esyj esyjVar = (esyj) esyk.a.v();
        esyjVar.a(11);
        if (!v2.b.L()) {
            v2.U();
        }
        esxp esxpVar2 = (esxp) v2.b;
        esyk esykVar = (esyk) esyjVar.Q();
        esykVar.getClass();
        esxpVar2.t = esykVar;
        esxpVar2.d |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        if (!v.b.L()) {
            v.U();
        }
        esxo esxoVar2 = (esxo) v.b;
        esxp esxpVar3 = (esxp) v2.Q();
        esxpVar3.getClass();
        esxoVar2.d = esxpVar3;
        esxoVar2.b |= 2;
        if (!eswzVar.b.L()) {
            eswzVar.U();
        }
        esxa esxaVar = (esxa) eswzVar.b;
        esxo esxoVar3 = (esxo) v.Q();
        esxoVar3.getClass();
        esxaVar.f = esxoVar3;
        esxaVar.b |= 4;
        fecj v5 = esys.a.v();
        esiu esiuVar = esiu.V;
        if (!v5.b.L()) {
            v5.U();
        }
        esys esysVar = (esys) v5.b;
        esysVar.c = esiuVar.a();
        esysVar.b |= 1;
        fecj v6 = esyo.a.v();
        fecj v7 = eswn.a.v();
        if (!v7.b.L()) {
            v7.U();
        }
        eswn eswnVar = (eswn) v7.b;
        eswhVar.getClass();
        eswnVar.c = eswhVar;
        eswnVar.b |= 1;
        if (!v6.b.L()) {
            v6.U();
        }
        esyo esyoVar = (esyo) v6.b;
        eswn eswnVar2 = (eswn) v7.Q();
        eswnVar2.getClass();
        esyoVar.g = eswnVar2;
        esyoVar.b |= 16;
        if (!v5.b.L()) {
            v5.U();
        }
        esys esysVar2 = (esys) v5.b;
        esyo esyoVar2 = (esyo) v6.Q();
        esyoVar2.getClass();
        esysVar2.d = esyoVar2;
        esysVar2.b |= 8;
        if (!eswzVar.b.L()) {
            eswzVar.U();
        }
        esxa esxaVar2 = (esxa) eswzVar.b;
        esys esysVar3 = (esys) v5.Q();
        esysVar3.getClass();
        esxaVar2.g = esysVar3;
        esxaVar2.b |= 8;
        ahws.d(getContext(), eswzVar, this.aE, b.c()).x(new dfae() { // from class: ajxe
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar) {
                if (dfaqVar.m()) {
                    return;
                }
                BackupSettingsFragment backupSettingsFragment = BackupSettingsFragment.this;
                backupSettingsFragment.ay.g("Exception writing audit record", dfaqVar.h(), new Object[0]);
            }
        });
        ajrc.j(3);
        this.aw.g(false);
        this.ax.b(new ajxs(this, false));
        aiaa a = aiab.a();
        a.c(15);
        a.b(b.c());
        final aiab a2 = a.a();
        this.ap.execute(new Runnable() { // from class: ajxm
            @Override // java.lang.Runnable
            public final void run() {
                final BackupSettingsFragment backupSettingsFragment = BackupSettingsFragment.this;
                Account account = backupSettingsFragment.aE;
                String str = account != null ? account.name : null;
                backupSettingsFragment.at.a.d(str, a2);
                asrb.a(new Runnable() { // from class: ajxc
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
        if (flos.d()) {
            StorageMeterPreference storageMeterPreference = this.aL;
            storageMeterPreference.b = aicy.a(account, storageMeterPreference.j);
            storageMeterPreference.k();
            final Intent intent = new Intent();
            if (ahrf.a() && account == null) {
                intent.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.SetBackupAccountFlowActivity");
                intent.putExtra("turnOff", false);
            } else {
                intent.setClassName("com.google.android.gms", "com.google.android.gms.backup.SetBackupAccountActivity");
                intent.putExtra("currentBackupAccount", account);
            }
            this.aL.o = new klp() { // from class: ajxl
                @Override // defpackage.klp
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
            this.ax.b(new ajwr(account, ajwr.c(ahpt.a(getContext(), account), new ahvq(ahvr.a(getContext()), new ahth(flos.c()))), new ajzq(this.aL, this)));
        }
        this.ag.o();
        aiew aiewVar = this.ax;
        Iterator it = this.ag.k(this.aE).iterator();
        while (it.hasNext()) {
            aiewVar.b((aiez) it.next());
        }
        aiewVar.b(new ajxr(this));
    }

    public final void R(boolean z) {
        this.aK.P(true != z ? R.string.backup_scheduling_information : R.string.backup_scheduling_information_no_wifi);
    }

    public final void S() {
        Y(new ajxu() { // from class: ajxd
            @Override // defpackage.ajxu
            public final void a(final Account account) {
                final BackupSettingsFragment backupSettingsFragment = BackupSettingsFragment.this;
                Account account2 = backupSettingsFragment.aE;
                if (account2 != null && account != null && !account2.equals(account)) {
                    backupSettingsFragment.d.ah(ajwx.d);
                    AppsBackupPreference appsBackupPreference = backupSettingsFragment.ak;
                    ajwx ajwxVar = ajwx.d;
                    appsBackupPreference.l(ajwxVar);
                    backupSettingsFragment.aj.l(ajwxVar);
                    backupSettingsFragment.ah.l(ajwxVar);
                    backupSettingsFragment.ai.l(ajwxVar);
                    backupSettingsFragment.ax.b(new ajxs(backupSettingsFragment, true));
                }
                backupSettingsFragment.aE = account;
                if (account == null || !backupSettingsFragment.ab()) {
                    backupSettingsFragment.O(false, false);
                    return;
                }
                if (ahpw.a.l(backupSettingsFragment.getContext())) {
                    ahpw ahpwVar = ahpw.a;
                    if (ahpwVar.m(backupSettingsFragment.getContext()) && ahpwVar.j(backupSettingsFragment.getContext())) {
                        backupSettingsFragment.d.k(backupSettingsFragment.ab());
                        backupSettingsFragment.al.o = new klp() { // from class: ajxo
                            @Override // defpackage.klp
                            public final boolean b(Preference preference) {
                                Intent intent = new Intent("android.settings.ACCOUNT_SYNC_SETTINGS");
                                intent.setPackage("com.android.settings");
                                Bundle bundle = new Bundle();
                                bundle.putParcelable("account", account);
                                intent.putExtra(":settings:show_fragment_args", bundle);
                                if (!flom.a.a().a()) {
                                    intent.setFlags(268435456);
                                }
                                BackupSettingsFragment.this.startActivity(intent);
                                return true;
                            }
                        };
                        backupSettingsFragment.Q();
                        if (backupSettingsFragment.aq && fllq.a.a().B()) {
                            backupSettingsFragment.ax.b(new ajxp(backupSettingsFragment));
                        }
                        new ahkk(backupSettingsFragment.getContext()).a().p((qfp) backupSettingsFragment.getContext(), new ajyq(backupSettingsFragment));
                        return;
                    }
                }
                backupSettingsFragment.O(true, false);
            }
        });
    }

    @Override // defpackage.ajyr
    public final void T() {
        if (this.aE != null) {
            Q();
        }
    }

    @Override // defpackage.ajyr
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
            ajiy.a(getContext());
        }
        boolean z2 = !z;
        this.d.H(z2);
        BackupNowPreference backupNowPreference = this.am;
        backupNowPreference.d = z;
        backupNowPreference.l();
        this.aL.H(z2);
    }

    @Override // defpackage.ajyr
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

    @Override // defpackage.ajyr, defpackage.ajxv, defpackage.ajyv, defpackage.kmb, defpackage.dg
    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.aN = bundle.getBoolean("photosEnablementSnackbarShown", false);
        }
        super.onCreate(bundle);
    }

    @Override // defpackage.ajyr, defpackage.dg
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
                ajrc.h(3);
            } else if (photosEnablementSnackbarInfo.b() != null) {
                this.ay.j("Showing Photos enablement error snackbar with Photos alley-oop intent", new Object[0]);
                aa(getContext().getString(R.string.ebnr_photos_snackbar_error_text), getContext().getString(R.string.ebnr_photos_snackbar_error_button), new View.OnClickListener() { // from class: ajxk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BackupSettingsFragment.this.startActivity(photosEnablementSnackbarInfo.b());
                    }
                });
                ajrc.g(3);
            } else if (photosEnablementSnackbarInfo.a() != null) {
                this.ay.j("Showing Photos enablement error snackbar with Photos backup settings intent", new Object[0]);
                String string = getContext().getString(R.string.ebnr_photos_snackbar_error_text);
                String string2 = getContext().getString(R.string.ebnr_photos_snackbar_error_button);
                final PendingIntent a = photosEnablementSnackbarInfo.a();
                aa(string, string2, new View.OnClickListener() { // from class: ajxg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BackupSettingsFragment.this.X(a);
                    }
                });
                ajrc.g(3);
            }
        } else if (photosEnablementSnackbarInfo.a() != null) {
            this.ay.j("Showing Photos enablement success snackbar", new Object[0]);
            CharSequence aj = aj(photosEnablementSnackbarInfo.c());
            String string3 = getContext().getString(R.string.ebnr_photos_snackbar_success_button);
            final PendingIntent a2 = photosEnablementSnackbarInfo.a();
            aa(aj, string3, new View.OnClickListener() { // from class: ajxg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BackupSettingsFragment.this.X(a2);
                }
            });
            ajrc.g(2);
        } else {
            this.ay.m("Photos enablement success snackbar missing intent for Photos backup settings", new Object[0]);
            Z(aj(photosEnablementSnackbarInfo.c()));
            ajrc.h(2);
        }
        this.aN = true;
    }

    @Override // defpackage.kmb, defpackage.dg
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("photosEnablementSnackbarShown", this.aN);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.ajyr, defpackage.kmb, defpackage.dg
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("scrollPreferenceKey")) == null) {
            return;
        }
        klv klvVar = new klv(this, string);
        if (this.b == null) {
            this.c = klvVar;
        } else {
            klvVar.run();
        }
        if (getContext() instanceof ajlk) {
            ((ajlk) getContext()).c();
        }
    }
}
