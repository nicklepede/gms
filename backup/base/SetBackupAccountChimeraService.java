package com.google.android.gms.backup.base;

import android.accounts.Account;
import android.content.Intent;
import android.os.Binder;
import android.os.UserHandle;
import android.text.TextUtils;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.ajif;
import defpackage.ajwt;
import defpackage.akeu;
import defpackage.focx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SetBackupAccountChimeraService extends TracingIntentService {
    private static final ajwt a = new ajwt("SetBackupAccountChimeraService");
    private akeu b;
    private ajif c;

    public SetBackupAccountChimeraService() {
        super("SetBackupAccountChimeraService");
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    public final void a(Intent intent) {
        ajwt ajwtVar = a;
        if (ajwtVar.b(3)) {
            ajwtVar.d("SetBackupAccountChimeraService invoked", new Object[0]);
        }
        Account account = (Account) intent.getParcelableExtra("backupAccount");
        UserHandle userHandle = (UserHandle) intent.getParcelableExtra("backupUserHandle");
        if (account == null || TextUtils.isEmpty(account.name) || !userHandle.isOwner()) {
            return;
        }
        if (this.b == null) {
            this.b = new akeu(this);
        }
        if (getPackageManager().getNameForUid(Binder.getCallingUid()).equals("com.google.android.backuptransport")) {
            this.b.y(2);
        } else {
            this.b.y(1);
        }
        if (focx.a.lK().a()) {
            ajwtVar.m("The SetBackupAccount service is disabled.", new Object[0]);
            return;
        }
        ajwtVar.h("Setting backup account", new Object[0]);
        if (this.c == null) {
            this.c = new ajif(this);
        }
        this.c.c(account);
    }
}
