package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.auth.account.be.RemoveAccountChimeraIntentService;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;
import defpackage.aano;
import defpackage.aanp;
import defpackage.adfx;
import defpackage.adjb;
import defpackage.adlg;
import defpackage.arkc;
import defpackage.arke;
import defpackage.arkf;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqh;
import defpackage.edfq;
import defpackage.edfr;
import defpackage.edjy;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class RemoveAccountChimeraActivity extends adlg implements edjy {
    private static final aano h = new aano("account");
    private static final aano i = new aano("reason");
    private static final aano j = new aano("is_unicorn_account");
    private static final aano k = new aano("is_from_finish_session");
    private final asot l = asot.c("Auth", asej.AUTH_ACCOUNT_DATA, "RemoveAccountChimeraActivity");
    private UserManager m;
    private ViewGroup n;

    public static Intent l(Context context, Account account, int i2, boolean z, arke arkeVar, boolean z2, boolean z3) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.RemoveAccountActivity");
        aanp aanpVar = new aanp();
        aanpVar.d(h, account);
        aanpVar.d(i, Integer.valueOf(i2));
        aanpVar.d(adjb.b, Boolean.valueOf(z));
        aanpVar.d(adjb.a, arkeVar == null ? null : arkeVar.a());
        aanpVar.d(j, Boolean.valueOf(z2));
        aanpVar.d(k, Boolean.valueOf(z3));
        return className.putExtras(aanpVar.a);
    }

    private final CharSequence o(int i2) {
        return i2 != 1 ? (i2 == 3 || i2 == 4) ? getString(R.string.auth_account_removed_dm_bad_result_description, new Object[]{getString(R.string.auth_account_start_over_and_signin_again)}) : i2 != 5 ? i2 != 6 ? getString(R.string.auth_account_removed_default_description, new Object[]{getString(R.string.auth_account_start_over_and_signin_again)}) : getString(R.string.auth_account_removed_restricted_by_admin_description) : getString(R.string.auth_account_removed_dm_not_supported_description) : getString(R.string.auth_account_removed_dm_setup_failed_description, new Object[]{getString(R.string.auth_account_start_over_and_signin_again)});
    }

    private final boolean p(UserHandle userHandle) {
        try {
            return this.m.removeUser(userHandle);
        } catch (IllegalAccessError | NoSuchMethodError e) {
            ((ejhf) this.l.j()).B("removeUser. Unable to remove user: %s", e.getMessage());
            return false;
        }
    }

    private final boolean q(UserHandle userHandle) {
        try {
            return ((ActivityManager) AppContextProvider.a().getSystemService(ActivityManager.class)).switchUser(userHandle);
        } catch (IllegalAccessError | NoSuchMethodError e) {
            ((ejhf) this.l.j()).B("switchUser. Unable to switch user: %s", e.getMessage());
            return false;
        }
    }

    @Override // defpackage.adkg
    protected final String gG() {
        return "RemoveAccountActivity";
    }

    @Override // defpackage.edjy
    public final void gs() {
        n();
    }

    @Override // defpackage.edjy
    public final void jw() {
        n();
    }

    public final void n() {
        if (!asqh.f() || !((Boolean) s().a(j)).booleanValue() || !((Boolean) s().a(k)).booleanValue()) {
            ((ejhf) this.l.j()).x("maybeRemoveCurrentUser. Skipping remove current user.");
        } else if (!q(UserHandle.SYSTEM)) {
            ((ejhf) this.l.j()).x("maybeRemoveCurrentUser. Failed to switch to user.");
        } else if (!p(Process.myUserHandle())) {
            ((ejhf) this.l.j()).x("maybeRemoveCurrentUser. Failed to remove user");
        }
        gD(-1, null);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        n();
    }

    @Override // defpackage.adlg, defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        CharSequence string;
        super.onCreate(bundle);
        Account account = (Account) s().a(h);
        int intValue = ((Integer) s().a(i)).intValue();
        this.m = (UserManager) AppContextProvider.a().getSystemService("user");
        startService(RemoveAccountChimeraIntentService.b(this, account));
        arkf f = arkf.f(this, true != arkc.i(t().a) ? R.layout.auth_account_removed : R.layout.auth_account_removed_glif);
        ViewGroup a = f.a();
        this.n = a;
        setContentView(a);
        switch (intValue) {
            case 1:
                string = getString(R.string.auth_account_removed_dm_setup_failed_title);
                break;
            case 2:
                string = getString(R.string.auth_account_removed_dm_setup_skipped_title);
                break;
            case 3:
            case 4:
                string = getString(R.string.common_something_went_wrong);
                break;
            case 5:
                string = getString(R.string.auth_account_removed_dm_not_supported_title);
                break;
            case 6:
                string = getString(R.string.auth_account_removed_restricted_by_admin_title);
                break;
            default:
                string = getTitle();
                break;
        }
        f.c(string);
        ViewGroup viewGroup = this.n;
        if (viewGroup instanceof SetupWizardLayout) {
            SetupWizardLayout setupWizardLayout = (SetupWizardLayout) viewGroup;
            setupWizardLayout.t().a(this);
            setupWizardLayout.t().b.setVisibility(4);
            ((TextView) findViewById(R.id.auth_account_removed_description)).setText(o(intValue));
        } else {
            ((GlifLayout) viewGroup.findViewById(R.id.setup_wizard_layout)).G(o(intValue));
        }
        boolean z = false;
        if (intValue != 5 && intValue != 6) {
            z = true;
        }
        ViewGroup viewGroup2 = this.n;
        boolean z2 = viewGroup2 instanceof SetupWizardLayout;
        int i2 = R.string.auth_remove_account_start_over;
        if (z2 && z) {
            Button button = ((SetupWizardLayout) viewGroup2).t().a;
            button.setCompoundDrawables(null, null, null, null);
            String string2 = getString(R.string.auth_remove_account_start_over);
            button.setText(string2);
            button.setContentDescription(string2);
        } else if (viewGroup2 instanceof GlifLayout) {
            edfq edfqVar = (edfq) ((GlifLayout) viewGroup2.findViewById(R.id.setup_wizard_layout)).q(edfq.class);
            edfr edfrVar = new edfr(this);
            edfrVar.c = 5;
            edfrVar.b = new adfx(this);
            edfrVar.d = R.style.SudGlifButton_Primary;
            if (true != z) {
                i2 = R.string.common_next;
            }
            edfrVar.b(i2);
            edfqVar.b(edfrVar.a());
        }
        arkc.e(this.n);
    }
}
