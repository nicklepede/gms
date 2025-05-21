package com.google.android.gms.auth.uiflows.consent;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import com.google.android.gms.common.widget.phone.ScrollViewWithEvents;
import defpackage.a;
import defpackage.aanu;
import defpackage.aazm;
import defpackage.abau;
import defpackage.adlg;
import defpackage.asej;
import defpackage.asot;
import defpackage.rqd;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GrantCredentialsWithAclChimeraActivity extends adlg implements View.OnClickListener {
    public static final /* synthetic */ int i = 0;
    private static final asot j = asot.b("GLSActivity", asej.AUTH_ACCOUNT_DATA);
    private rqd A;
    private Button B;
    private Button C;
    private ScrollViewWithEvents D;
    private String k;
    private int l;
    private String m;
    private String n;
    private int r;
    private boolean s;
    private boolean x;
    private Drawable y;
    private String z;
    private ArrayList o = new ArrayList();
    long h = 0;

    private final Intent b(abau abauVar, aazm aazmVar) {
        Intent intent = new Intent();
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        String str = null;
        FACLConfig fACLConfig = null;
        for (int i2 = 0; i2 < size; i2++) {
            ScopeData scopeData = (ScopeData) arrayList.get(i2);
            if (scopeData.g) {
                fACLConfig = new FACLConfig(scopeData.n, scopeData.h, scopeData.o, scopeData.l, scopeData.m, scopeData.k);
            }
            if (scopeData.b()) {
                str = scopeData.f;
            }
        }
        intent.putExtra(ConsentResult.a, new ConsentResult(abauVar, str, fACLConfig, aazmVar, getIntent().getStringExtra("GrantCredentialsWithAclChimeraActivityconsentCookieWrapper")));
        return intent;
    }

    private final void j(Bundle bundle) {
        this.k = bundle.getString("callingPkg");
        this.l = bundle.getInt("callingUid");
        this.m = bundle.getString("service");
        this.n = bundle.getString("acctName");
        this.r = bundle.getInt("lastScopeIndex");
        this.s = bundle.getBoolean("GrantCredentialsWithAclChimeraActivityhasTitle");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("scopeData");
        if (parcelableArrayList != null) {
            this.o.clear();
            this.o.addAll(parcelableArrayList);
        }
        this.x = bundle.getBoolean("GrantCredentialsWithAclChimeraActivityisRemoteApp");
        aanu aanuVar = new aanu(this);
        this.y = aanuVar.a(this.k);
        CharSequence b = aanuVar.b(this.k);
        if (b != null) {
            this.z = b.toString();
        } else if (this.x) {
            this.z = bundle.getString("GrantCredentialsWithAclChimeraActivityremoteAppLabel");
        }
    }

    private final void l() {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ScopeData scopeData = (ScopeData) arrayList.get(i2);
            scopeData.f = null;
            scopeData.h = null;
            scopeData.k = false;
            scopeData.l = false;
            scopeData.m = false;
            scopeData.n = false;
            scopeData.o = false;
        }
        gD(0, b(abau.PERMISSION_DENIED, aazm.REJECTED));
        this.C.setEnabled(false);
        this.B.setEnabled(false);
    }

    private static final String n(int i2) {
        return a.j(i2, "scopeFragment");
    }

    @Override // defpackage.adkg
    public final String gG() {
        return "GrantCredentialsWithAclActivity";
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        l();
        super.onBackPressed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (r12.b.L() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        r12.U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a7, code lost:
    
        ((defpackage.ascf) r12.b).b = defpackage.feeq.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00af, code lost:
    
        r7 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v35 */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r17) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclChimeraActivity.onClick(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x016a, code lost:
    
        r3 = null;
     */
    @Override // defpackage.adlg, defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("callingPkg", this.k);
        bundle.putInt("callingUid", this.l);
        bundle.putString("service", this.m);
        bundle.putString("acctName", this.n);
        bundle.putParcelableArrayList("scopeData", this.o);
        bundle.putInt("lastScopeIndex", this.r);
        bundle.putBoolean("GrantCredentialsWithAclChimeraActivityhasTitle", this.s);
        bundle.putBoolean("GrantCredentialsWithAclChimeraActivityisRemoteApp", this.x);
        bundle.putString("GrantCredentialsWithAclChimeraActivityremoteAppLabel", this.z);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStart() {
        super.onStart();
    }

    @Override // defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStop() {
        super.onStop();
    }
}
