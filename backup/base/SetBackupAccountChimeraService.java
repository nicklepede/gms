package com.google.android.gms.backup.base;

import android.accounts.Account;
import android.content.Intent;
import android.os.Binder;
import android.os.UserHandle;
import android.text.TextUtils;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.ahhp;
import defpackage.ahwd;
import defpackage.aiee;
import defpackage.flln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SetBackupAccountChimeraService extends TracingIntentService {
    private static final ahwd a = new ahwd("SetBackupAccountChimeraService");
    private aiee b;
    private ahhp c;

    public SetBackupAccountChimeraService() {
        super("SetBackupAccountChimeraService");
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    public final void a(Intent intent) {
        ahwd ahwdVar = a;
        if (ahwdVar.b(3)) {
            ahwdVar.d("SetBackupAccountChimeraService invoked", new Object[0]);
        }
        Account account = (Account) intent.getParcelableExtra("backupAccount");
        UserHandle userHandle = (UserHandle) intent.getParcelableExtra("backupUserHandle");
        if (account == null || TextUtils.isEmpty(account.name) || !userHandle.isOwner()) {
            return;
        }
        if (this.b == null) {
            this.b = new aiee(this);
        }
        if (getPackageManager().getNameForUid(Binder.getCallingUid()).equals("com.google.android.backuptransport")) {
            this.b.y(2);
        } else {
            this.b.y(1);
        }
        if (flln.a.a().a()) {
            ahwdVar.m("The SetBackupAccount service is disabled.", new Object[0]);
            return;
        }
        ahwdVar.h("Setting backup account", new Object[0]);
        if (this.c == null) {
            this.c = new ahhp(this);
        }
        this.c.c(account);
    }
}
