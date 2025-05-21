package com.google.android.gms.appinvite;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.ui.context.section.CustomSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.ListSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.SelectionSectionInfo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.anxo;
import defpackage.aqsy;
import defpackage.aqup;
import defpackage.aqxp;
import defpackage.aqxq;
import defpackage.aqxr;
import defpackage.aqxs;
import defpackage.asej;
import defpackage.asnb;
import defpackage.asnd;
import defpackage.asng;
import defpackage.asot;
import defpackage.bp;
import defpackage.ctji;
import defpackage.ctjj;
import defpackage.ctjk;
import defpackage.dg;
import defpackage.ejhf;
import defpackage.ekqu;
import defpackage.ekra;
import defpackage.ekrd;
import defpackage.ekre;
import defpackage.ekrm;
import defpackage.ekro;
import defpackage.ekrp;
import defpackage.ekrv;
import defpackage.ew;
import defpackage.feab;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.fkbi;
import defpackage.iln;
import defpackage.qet;
import defpackage.twh;
import defpackage.twi;
import defpackage.twj;
import defpackage.twl;
import defpackage.twm;
import defpackage.twn;
import defpackage.two;
import defpackage.twq;
import defpackage.tws;
import defpackage.twv;
import defpackage.tyh;
import defpackage.tyj;
import defpackage.tyo;
import defpackage.typ;
import defpackage.tyq;
import defpackage.tyr;
import defpackage.uaa;
import defpackage.uaz;
import defpackage.ubi;
import defpackage.un;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes2.dex */
public class AppInviteChimeraActivity extends qet implements TextWatcher, typ, tyr, tyq, aqxq, aqxr, tyh {
    public static final asot j = asot.b("AppInvite", asej.APP_INVITE);
    private Account A;
    private View B;
    private ImageView C;
    private ImageView D;
    private tyj E;
    private asnb F;
    private twn G;
    private two H;
    private Uri I;
    private String J;
    private String K;
    private String L;
    private String M;
    private boolean N;
    private boolean O;
    private CharSequence P;
    private CharSequence Q;
    private int R;
    private boolean S;
    private long T;
    private long U;
    private long V;
    private long W;
    private long X;
    private long Y;
    public aqxs k;
    public String l;
    public uaa m;
    public Toolbar n;
    public TextView o;
    public EditText p;
    public View q;
    public tyo r;
    public Bitmap s;
    public View.OnClickListener t;
    public twv u;
    public boolean v;
    public boolean w;
    public boolean x;
    private AppInviteResponseReceiver y;
    private List z;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class AppInviteResponseReceiver extends TracingBroadcastReceiver {
        public AppInviteResponseReceiver() {
            super("appinvite");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            AppInviteChimeraActivity.this.u(intent);
        }
    }

    private final void A() {
        HashMap hashMap;
        String string;
        this.Y = SystemClock.uptimeMillis();
        Uri uri = (Uri) getIntent().getParcelableExtra("com.google.android.gms.appinvite.DEEP_LINK_URL");
        Bundle bundleExtra = getIntent().getBundleExtra("com.google.android.gms.appinvite.REFERRAL_PARAMETERS_URI");
        if (bundleExtra == null) {
            hashMap = null;
        } else {
            HashMap hashMap2 = new HashMap(bundleExtra.size());
            for (String str : bundleExtra.keySet()) {
                if (str != null && (string = bundleExtra.getString(str)) != null) {
                    hashMap2.put(str, string);
                }
            }
            hashMap = hashMap2;
        }
        String uri2 = uri != null ? uri.toString() : null;
        String stringExtra = getIntent().getStringExtra("com.google.android.gms.appinvite.EMAIL_CONTENT");
        String stringExtra2 = getIntent().getStringExtra("com.google.android.gms.appinvite.EMAIL_SUBJECT");
        Uri uri3 = this.I;
        boolean z = false;
        if (uri3 != null && !uri3.getScheme().equals("https") && !this.I.getScheme().equals("http")) {
            z = true;
        }
        Context applicationContext = getApplicationContext();
        String q = asng.q(this);
        String str2 = this.A.name;
        String obj = this.p.getText().toString();
        boolean z2 = this.S;
        String str3 = true != z2 ? null : stringExtra2;
        String str4 = true != z2 ? null : stringExtra;
        String str5 = this.J;
        String D = D();
        ArrayList arrayList = this.E.at;
        String str6 = this.L;
        String str7 = this.M;
        Uri uri4 = z ? null : this.I;
        Bitmap bitmap = z ? this.s : null;
        CharSequence charSequence = this.P;
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        CharSequence charSequence3 = this.Q;
        tws twsVar = new tws(applicationContext, q, str2, obj, str3, str4, uri2, hashMap, str5, D, arrayList, str6, str7, uri4, bitmap, charSequence2, charSequence3 != null ? charSequence3.toString() : null, this.R);
        AppInviteIntentOperation.a.offer(twsVar);
        startService(IntentOperation.getStartIntent(this, AppInviteIntentOperation.class, "com.google.android.gms.appinvite.send.INTENT"));
        this.z.add(Long.valueOf(twsVar.a));
    }

    private final void B(Account account, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (account.equals(this.A)) {
            return;
        }
        if (this.A != null) {
            twv twvVar = this.u;
            fecj v = ekqu.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ekqu ekquVar = (ekqu) v.b;
            ekquVar.b |= 1;
            ekquVar.c = true;
            twvVar.g((ekqu) v.Q(), 9, twvVar.b);
        }
        if (this.m.a.getParent() != null) {
            ((ViewGroup) this.m.a.getParent()).removeView(this.m.a);
        }
        this.A = account;
        this.n.u(2131232803);
        this.n.s(R.string.common_choose_account);
        boolean z2 = false;
        this.x = false;
        this.q.setVisibility(8);
        ArrayList arrayList5 = null;
        this.D.setImageDrawable(null);
        ctji ctjiVar = new ctji();
        ctjiVar.a = 80;
        ctjj a = ctjiVar.a();
        aqxs aqxsVar = this.k;
        if (aqxsVar != null && (aqxsVar.p() || this.k.q())) {
            this.k.h();
        }
        aqxp aqxpVar = new aqxp(this);
        aqxpVar.g(this.A.name);
        aqxpVar.e(this);
        aqxpVar.f(this);
        aqxpVar.d(ctjk.a, a);
        this.k = aqxpVar.a();
        ew supportFragmentManager = getSupportFragmentManager();
        tyj tyjVar = (tyj) supportFragmentManager.h("selectionFragment");
        this.E = tyjVar;
        if (z || tyjVar == null) {
            Intent intent = getIntent();
            boolean hasSystemFeature = getPackageManager().hasSystemFeature("android.hardware.telephony");
            int checkSelfPermission = checkSelfPermission("android.permission.SEND_SMS");
            if (hasSystemFeature && checkSelfPermission == 0) {
                z2 = true;
            }
            if (aqup.d(this).h(this.l)) {
                arrayList5 = intent.getParcelableArrayListExtra("com.google.android.gms.appinvite.ADDITIONAL_SUGGESTIONS");
                arrayList2 = intent.getParcelableArrayListExtra("com.google.android.gms.appinvite.additionalPeople");
                arrayList3 = E(intent, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_PERSON_IDS");
                arrayList4 = E(intent, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_EMAIL_ADDRESSES");
                arrayList = E(intent, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_PHONE_NUMBERS");
            } else {
                arrayList = null;
                arrayList2 = null;
                arrayList3 = null;
                arrayList4 = null;
            }
            Resources resources = getResources();
            String[] split = fkbi.a.a().g().split(";");
            fkbi fkbiVar = fkbi.a;
            String[] split2 = fkbiVar.a().e().split(";");
            String[] split3 = fkbiVar.a().f().split(";");
            if (!z2) {
                split = F(split);
                split2 = F(split2);
                split3 = F(split3);
            }
            String[] strArr = split3;
            ArrayList arrayList6 = new ArrayList();
            arrayList6.add(new CustomSectionInfo(new int[]{R.layout.appinvite_edit_message}));
            SelectionSectionInfo selectionSectionInfo = new SelectionSectionInfo();
            selectionSectionInfo.p = true;
            selectionSectionInfo.a = getString(R.string.appinvite_recipients_hint);
            arrayList6.add(selectionSectionInfo);
            ListSectionInfo listSectionInfo = new ListSectionInfo("suggested");
            listSectionInfo.b = split;
            listSectionInfo.i = 1;
            listSectionInfo.l = arrayList5;
            listSectionInfo.m = arrayList3;
            listSectionInfo.b(arrayList4);
            listSectionInfo.c(arrayList);
            listSectionInfo.g = getString(R.string.appinvite_grid_header);
            arrayList6.add(listSectionInfo);
            ListSectionInfo listSectionInfo2 = new ListSectionInfo("identityPeople");
            listSectionInfo2.d = "useCachedContacts";
            listSectionInfo2.b = split2;
            listSectionInfo2.e = true;
            listSectionInfo2.i = 2;
            listSectionInfo2.l = arrayList2;
            listSectionInfo2.g = getString(R.string.appinvite_list_header);
            arrayList6.add(listSectionInfo2);
            this.E = tyj.z(this.A.name, (int) fkbiVar.a().c(), null, true, null, false, strArr, false, resources.getInteger(R.integer.appinivte_num_portrait_grid_columns), resources.getInteger(R.integer.appinivte_num_landscape_grid_columns), arrayList6, this.l, false, null, null, null, null, true);
            bp bpVar = new bp(supportFragmentManager);
            bpVar.z(R.id.fragment_container, this.E, "selectionFragment");
            bpVar.b();
        }
        tyj tyjVar2 = this.E;
        tyjVar2.ag = this;
        tyjVar2.ah = this;
        tyjVar2.ai = this;
        tyjVar2.az = this;
    }

    private final void C() {
        tyj tyjVar = this.E;
        boolean z = tyjVar != null && tyjVar.L();
        this.B.setVisibility(true != z ? 8 : 0);
        if (z) {
            asnb asnbVar = this.F;
            if (asnbVar != null && asnbVar.isRunning()) {
                this.F.stop();
            }
            this.C.setVisibility(8);
        } else {
            if (this.F == null) {
                asnb x = uaz.x(this.C);
                this.F = x;
                this.C.setImageDrawable(x);
            }
            if (!this.F.isRunning()) {
                this.F.start();
            }
            this.C.setVisibility(0);
        }
        supportInvalidateOptionsMenu();
        ew supportFragmentManager = getSupportFragmentManager();
        bp bpVar = new bp(supportFragmentManager);
        dg h = supportFragmentManager.h("progressFragment");
        List list = this.z;
        if (list == null || list.isEmpty()) {
            if (h != null) {
                bpVar.n(h);
            }
        } else if (h == null) {
            bpVar.v(uaz.y(), "progressFragment");
        }
        if (bpVar.j()) {
            return;
        }
        bpVar.b();
    }

    private static final String D() {
        return UUID.randomUUID().toString();
    }

    private static final ArrayList E(Intent intent, String str) {
        ArrayList<CharSequence> charSequenceArrayListExtra = intent.getCharSequenceArrayListExtra(str);
        if (charSequenceArrayListExtra == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(charSequenceArrayListExtra.size());
        int size = charSequenceArrayListExtra.size();
        for (int i = 0; i < size; i++) {
            CharSequence charSequence = charSequenceArrayListExtra.get(i);
            arrayList.add(charSequence != null ? charSequence.toString() : null);
        }
        return arrayList;
    }

    private static final String[] F(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.remove("phone");
        return arrayList.size() == strArr.length ? strArr : (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private final String w() {
        int length = 100 - this.p.getText().length();
        if (length >= 0) {
            return getResources().getQuantityString(R.plurals.appinvite_message_within_limit, length, Integer.valueOf(length));
        }
        int i = -length;
        return getResources().getQuantityString(R.plurals.appinvite_message_over_limit, i, Integer.valueOf(i));
    }

    private final void x() {
        if (asnd.h(this, this.l).size() > 1) {
            this.n.w(new twm(this));
        }
    }

    private final void y(boolean z) {
        long uptimeMillis = this.Y != 0 ? SystemClock.uptimeMillis() - this.Y : 0L;
        twv twvVar = this.u;
        tyj tyjVar = this.E;
        List A = tyjVar != null ? tyjVar.A() : null;
        long uptimeMillis2 = SystemClock.uptimeMillis() - this.T;
        boolean z2 = (this.U == 0 || this.V == 0) ? false : true;
        boolean z3 = this.V != 0;
        int[] iArr = new int[4];
        twv.a(A, iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        fecj v = ekrp.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ekrp ekrpVar = (ekrp) fecpVar;
        ekrpVar.b |= 1;
        ekrpVar.c = z;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        ekrp ekrpVar2 = (ekrp) fecpVar2;
        ekrpVar2.b |= 2;
        ekrpVar2.d = i;
        if (!fecpVar2.L()) {
            v.U();
        }
        fecp fecpVar3 = v.b;
        ekrp ekrpVar3 = (ekrp) fecpVar3;
        ekrpVar3.b |= 4;
        ekrpVar3.e = i4;
        if (!fecpVar3.L()) {
            v.U();
        }
        fecp fecpVar4 = v.b;
        ekrp ekrpVar4 = (ekrp) fecpVar4;
        ekrpVar4.b |= 8;
        ekrpVar4.f = i3;
        if (!fecpVar4.L()) {
            v.U();
        }
        fecp fecpVar5 = v.b;
        ekrp ekrpVar5 = (ekrp) fecpVar5;
        ekrpVar5.b |= 16;
        ekrpVar5.g = i2;
        if (!fecpVar5.L()) {
            v.U();
        }
        fecp fecpVar6 = v.b;
        ekrp ekrpVar6 = (ekrp) fecpVar6;
        ekrpVar6.b |= 32;
        ekrpVar6.h = uptimeMillis;
        if (!fecpVar6.L()) {
            v.U();
        }
        fecp fecpVar7 = v.b;
        ekrp ekrpVar7 = (ekrp) fecpVar7;
        ekrpVar7.b |= 64;
        ekrpVar7.i = uptimeMillis2;
        if (!fecpVar7.L()) {
            v.U();
        }
        fecp fecpVar8 = v.b;
        ekrp ekrpVar8 = (ekrp) fecpVar8;
        ekrpVar8.b |= 128;
        ekrpVar8.j = z2;
        if (!fecpVar8.L()) {
            v.U();
        }
        ekrp ekrpVar9 = (ekrp) v.b;
        ekrpVar9.b |= 256;
        ekrpVar9.k = z3;
        twvVar.g((ekrp) v.Q(), 8, twvVar.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[Catch: IOException -> 0x009f, IOException | XmlPullParserException -> 0x00a1, TryCatch #2 {IOException | XmlPullParserException -> 0x00a1, blocks: (B:2:0x0000, B:5:0x000a, B:7:0x0011, B:9:0x0023, B:11:0x0038, B:13:0x003e, B:26:0x0078, B:28:0x0080, B:33:0x0083, B:35:0x008b, B:38:0x008e, B:40:0x0096, B:30:0x0098), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z(android.content.res.XmlResourceParser r7) {
        /*
            r6 = this;
            r7.next()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            int r0 = r7.getEventType()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
        L7:
            r1 = 1
            if (r0 == r1) goto L9e
            int r0 = r7.getEventType()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            r2 = 2
            if (r0 != r2) goto L98
            java.lang.String r0 = r7.getName()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            java.lang.String r0 = r0.toLowerCase(r3)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            java.lang.String r3 = "string"
            boolean r0 = r0.equals(r3)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            if (r0 == 0) goto L98
            java.lang.String r0 = "name"
            r3 = 0
            java.lang.String r0 = r7.getAttributeValue(r3, r0)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            java.lang.String r3 = r7.nextText()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            java.lang.String r3 = r3.trim()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            if (r4 != 0) goto L98
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            if (r4 != 0) goto L98
            int r4 = r0.hashCode()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            r5 = -1657726487(0xffffffff9d3119e9, float:-2.343915E-21)
            if (r4 == r5) goto L66
            r5 = -1567212789(0xffffffffa2963b0b, float:-4.0720096E-18)
            if (r4 == r5) goto L5c
            r5 = 1737683639(0x6792f2b7, float:1.3878856E24)
            if (r4 == r5) goto L52
            goto L70
        L52:
            java.lang.String r4 = "ga_trackingId"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L70
            r0 = 0
            goto L71
        L5c:
            java.lang.String r4 = "ai_ios_target_application"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L70
            r0 = r1
            goto L71
        L66:
            java.lang.String r4 = "ai_android_target_application"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L70
            r0 = r2
            goto L71
        L70:
            r0 = -1
        L71:
            if (r0 == 0) goto L8e
            if (r0 == r1) goto L83
            if (r0 == r2) goto L78
            goto L98
        L78:
            java.lang.String r0 = r6.M     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            if (r0 == 0) goto L98
            r6.M = r3     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            goto L98
        L83:
            java.lang.String r0 = r6.L     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            if (r0 == 0) goto L98
            r6.L = r3     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            goto L98
        L8e:
            java.lang.String r0 = r6.J     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            if (r0 == 0) goto L98
            r6.J = r3     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
        L98:
            int r0 = r7.next()     // Catch: java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> La1
            goto L7
        L9e:
            return
        L9f:
            r7 = move-exception
            goto La2
        La1:
            r7 = move-exception
        La2:
            asot r0 = com.google.android.gms.appinvite.AppInviteChimeraActivity.j
            ejgq r0 = r0.i()
            java.lang.String r1 = "Error parsing configuration file"
            defpackage.a.Q(r0, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.appinvite.AppInviteChimeraActivity.z(android.content.res.XmlResourceParser):void");
    }

    public final Bundle a(int i, CharSequence charSequence) {
        Bundle bundle = new Bundle();
        bundle.putInt("View_id", anxo.a(this, i));
        bundle.putCharSequence("TextView_text", charSequence);
        return bundle;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = 100 - editable.length();
        String w = w();
        if (length < 0) {
            this.p.announceForAccessibility(w());
            this.N = true;
            this.O = true;
        } else if (!this.O && length <= 10) {
            this.p.announceForAccessibility(w());
            this.N = true;
            this.O = true;
        }
        this.o.setText(String.format(getString(R.string.appinvite_message_limit), Integer.valueOf(editable.length()), 100));
        this.o.setContentDescription(w);
        supportInvalidateOptionsMenu();
        if (!this.N) {
            this.p.announceForAccessibility(w());
            this.N = true;
        }
        this.v = true;
    }

    @Override // defpackage.tyq
    public final void k(ContactPerson.ContactMethod contactMethod, boolean z) {
        twv twvVar = this.u;
        fecj v = ekro.a.v();
        int i = contactMethod.a;
        if (i == 0) {
            if (!v.b.L()) {
                v.U();
            }
            ekro ekroVar = (ekro) v.b;
            ekroVar.c = 1;
            ekroVar.b = 1 | ekroVar.b;
        } else if (i == 1) {
            if (!v.b.L()) {
                v.U();
            }
            ekro ekroVar2 = (ekro) v.b;
            ekroVar2.c = 2;
            ekroVar2.b = 1 | ekroVar2.b;
        } else if (i != 2) {
            if (!v.b.L()) {
                v.U();
            }
            ekro ekroVar3 = (ekro) v.b;
            ekroVar3.c = 0;
            ekroVar3.b = 1 | ekroVar3.b;
        } else {
            if (!v.b.L()) {
                v.U();
            }
            ekro ekroVar4 = (ekro) v.b;
            ekroVar4.c = 3;
            ekroVar4.b = 1 | ekroVar4.b;
        }
        if (!v.b.L()) {
            v.U();
        }
        ekro ekroVar5 = (ekro) v.b;
        ekroVar5.b = 2 | ekroVar5.b;
        ekroVar5.d = z;
        twvVar.g((ekro) v.Q(), 7, twvVar.b);
    }

    @Override // defpackage.typ
    public final void l() {
        ubi.a(this, getString(R.string.appinvite_load_error), false, true);
        finish();
    }

    @Override // defpackage.typ
    public final synchronized void m(int i, int i2) {
        long uptimeMillis = SystemClock.uptimeMillis() - this.T;
        this.V = uptimeMillis;
        if (this.U == 0) {
            this.U = uptimeMillis;
        }
        C();
        twv twvVar = this.u;
        long j2 = this.V;
        long j3 = this.U;
        long j4 = this.W;
        long j5 = this.X;
        ArrayList arrayList = new ArrayList();
        arrayList.add(twv.f(2, j2));
        arrayList.add(twv.f(1, j3));
        arrayList.add(twv.f(3, j4));
        arrayList.add(twv.f(4, 0L));
        arrayList.add(twv.f(5, j5));
        fecj v = ekrv.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ekrv ekrvVar = (ekrv) fecpVar;
        ekrvVar.b = 1 | ekrvVar.b;
        ekrvVar.c = i;
        if (!fecpVar.L()) {
            v.U();
        }
        ekrv ekrvVar2 = (ekrv) v.b;
        ekrvVar2.b |= 2;
        ekrvVar2.d = i2;
        if (!arrayList.isEmpty()) {
            if (!v.b.L()) {
                v.U();
            }
            ekrv ekrvVar3 = (ekrv) v.b;
            fedh fedhVar = ekrvVar3.e;
            if (!fedhVar.c()) {
                ekrvVar3.e = fecp.E(fedhVar);
            }
            feab.E(arrayList, ekrvVar3.e);
        }
        twvVar.g((ekrv) v.Q(), 3, twvVar.b);
    }

    @Override // defpackage.typ
    public final synchronized void n(int i, int i2) {
        if (this.U == 0) {
            this.U = SystemClock.uptimeMillis() - this.T;
        }
        C();
    }

    @Override // defpackage.tyq
    public final synchronized void o() {
        this.X = SystemClock.uptimeMillis() - this.T;
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i == 2) {
                if (i2 == -1) {
                    A();
                    return;
                }
                ubi.a(this, getString(R.string.appinvite_send_error), false, true);
                setResult(203);
                finish();
                return;
            }
            return;
        }
        if (i2 != -1) {
            if (this.A == null) {
                y(false);
                setResult(202);
                finish();
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("authAccount");
        B(new Account(stringExtra, "com.google"), true);
        SharedPreferences.Editor edit = getSharedPreferences("appinvite.default_account_prefs", 0).edit();
        edit.putString(this.l, stringExtra);
        edit.apply();
        x();
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        super.onBackPressed();
        if (isFinishing()) {
            y(false);
        }
    }

    @Override // defpackage.aqzv
    public final void onConnected(Bundle bundle) {
        AppInviteChimeraActivity appInviteChimeraActivity;
        if (this.x || this.A == null) {
            appInviteChimeraActivity = this;
        } else {
            appInviteChimeraActivity = this;
            twn twnVar = new twn(appInviteChimeraActivity, this, this.k, this.A.name, this.n);
            appInviteChimeraActivity.G = twnVar;
            twnVar.execute(new Void[0]);
        }
        if (appInviteChimeraActivity.S || appInviteChimeraActivity.I == null || appInviteChimeraActivity.D.getDrawable() != null) {
            return;
        }
        two twoVar = new two(this, this, appInviteChimeraActivity.I, appInviteChimeraActivity.D);
        appInviteChimeraActivity.H = twoVar;
        twoVar.execute(new Void[0]);
    }

    @Override // defpackage.arcf
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.k.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        ?? r15;
        Account account;
        Account account2;
        Account account3;
        super.onCreate(bundle);
        setContentView(R.layout.appinvite_activity);
        String q = asng.q(this);
        this.l = q;
        String m = asng.m(this, q);
        if (bundle != null) {
            this.K = bundle.getString("sessionId");
        } else {
            this.K = D();
        }
        twv twvVar = new twv(getApplicationContext(), this.K);
        this.u = twvVar;
        twvVar.c();
        this.T = SystemClock.uptimeMillis();
        Intent intent = getIntent();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.google.android.gms.appinvite.ADDITIONAL_SUGGESTIONS");
        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("com.google.android.gms.appinvite.additionalPeople");
        ArrayList E = E(intent, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_PERSON_IDS");
        ArrayList E2 = E(intent, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_EMAIL_ADDRESSES");
        ArrayList E3 = E(intent, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_PHONE_NUMBERS");
        CharSequence charSequenceExtra = intent.getCharSequenceExtra("com.google.android.gms.appinvite.MESSAGE");
        Uri uri = (Uri) intent.getParcelableExtra("com.google.android.gms.appinvite.DEEP_LINK_URL");
        String uri2 = uri != null ? uri.toString() : null;
        int length = charSequenceExtra != null ? charSequenceExtra.length() : 0;
        if (TextUtils.isEmpty(this.l)) {
            this.u.b(false, parcelableArrayListExtra, parcelableArrayListExtra2, E, E2, E3, this.l, m, length, uri2);
            ubi.a(this, getString(R.string.appinvite_start_error), false, true);
            setResult(true != TextUtils.isEmpty(this.l) ? 200 : 201);
            finish();
            return;
        }
        this.S = (TextUtils.isEmpty(intent.getStringExtra("com.google.android.gms.appinvite.EMAIL_SUBJECT")) || TextUtils.isEmpty(intent.getStringExtra("com.google.android.gms.appinvite.EMAIL_CONTENT"))) ? false : true;
        setTitle(intent.getCharSequenceExtra("com.google.android.gms.appinvite.TITLE"));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.n = toolbar;
        ht(toolbar);
        this.B = findViewById(R.id.fragment_container);
        this.C = (ImageView) findViewById(R.id.progress_bar);
        this.z = new ArrayList();
        if (bundle != null) {
            for (long j2 : bundle.getLongArray("pendingOperations")) {
                this.z.add(Long.valueOf(j2));
            }
        }
        if (bundle == null) {
            r15 = 0;
            this.u.b(true, parcelableArrayListExtra, parcelableArrayListExtra2, E, E2, E3, this.l, m, length, uri2);
            Account account4 = (Account) intent.getParcelableExtra("com.google.android.gms.appinvite.ACCOUNT_NAME");
            this.w = false;
            account = account4;
        } else {
            r15 = 0;
            account = (Account) bundle.getParcelable("account");
            this.w = bundle.getBoolean("messageFocused");
            this.v = bundle.getBoolean("message_edited");
            charSequenceExtra = bundle.getString("message");
            this.N = bundle.getBoolean("messageLimitFirstEdit");
            this.O = bundle.getBoolean("messageLimitNearWarning");
        }
        uaa uaaVar = new uaa(getLayoutInflater().inflate(R.layout.appinvite_edit_message, (ViewGroup) this.B, (boolean) r15));
        this.m = uaaVar;
        View view = uaaVar.z;
        if (this.S) {
            view.setOnClickListener(new twh(this));
        } else {
            view.setVisibility(8);
        }
        this.I = intent.getData();
        uaa uaaVar2 = this.m;
        this.q = uaaVar2.y;
        ImageView imageView = uaaVar2.x;
        this.D = imageView;
        imageView.setContentDescription(getString(R.string.appinvite_image_preview));
        this.t = new twi(this);
        tyo tyoVar = (tyo) getSupportFragmentManager().h("imagePreviewFragment");
        this.r = tyoVar;
        if (tyoVar != null) {
            tyoVar.ag = this.t;
        }
        this.D.setOnClickListener(new twj(this));
        uaa uaaVar3 = this.m;
        this.o = uaaVar3.w;
        EditText editText = uaaVar3.u;
        this.p = editText;
        editText.setText(charSequenceExtra);
        if (charSequenceExtra != null && charSequenceExtra.length() > 100) {
            afterTextChanged(this.p.getText());
        }
        this.p.addTextChangedListener(this);
        this.p.setOnFocusChangeListener(new twl(this));
        this.J = intent.getStringExtra("com.google.android.gms.appinvite.GOOGLE_ANALYTICS_TRACKING_ID");
        this.L = intent.getStringExtra("com.google.android.gms.appinvite.iosTargetApplication");
        this.M = getIntent().getStringExtra("com.google.android.gms.appinvite.androidTargetApplication");
        this.P = aqup.d(this).h(this.l) ? intent.getCharSequenceExtra("com.google.android.gms.appinvite.DESCRIPTION") : null;
        this.Q = intent.getCharSequenceExtra("com.google.android.gms.appinvite.BUTTON_TEXT");
        this.R = intent.getIntExtra("com.google.android.gms.appinvite.appMinimumVersionCode", r15);
        try {
            Resources resources = createPackageContext(this.l, r15).getResources();
            int identifier = resources.getIdentifier("ai_config", "xml", this.l);
            if (identifier != 0) {
                z(resources.getXml(identifier));
            }
        } catch (PackageManager.NameNotFoundException e) {
            ((ejhf) ((ejhf) j.i()).s(e)).x("getCallingAppInviteConfiguration failed");
        }
        if (account == null) {
            account2 = null;
            String string = getSharedPreferences("appinvite.default_account_prefs", r15).getString(this.l, null);
            if (!TextUtils.isEmpty(string)) {
                account = new Account(string, "com.google");
            }
        } else {
            account2 = null;
        }
        if (account == null || !asnd.o(this, account, this.l)) {
            List h = asnd.h(this, this.l);
            account3 = h.size() == 1 ? (Account) h.get(r15) : account2;
        } else {
            account3 = account;
        }
        if (account3 == null) {
            t();
        } else {
            B(account3, r15);
            x();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.appinvite_activity, menu);
        MenuItem item = menu.getItem(0);
        tyj tyjVar = this.E;
        if (tyjVar == null || !tyjVar.L() || this.E.at.isEmpty() || this.p.getText().length() == 0 || this.p.getText().length() > 100) {
            item.getIcon().setColorFilter(getResources().getColor(R.color.appinvite_disabled_send), PorterDuff.Mode.MULTIPLY);
            item.setEnabled(false);
        } else {
            item.getIcon().setColorFilter(getResources().getColor(R.color.material_grey_white_1000), PorterDuff.Mode.MULTIPLY);
            item.setEnabled(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_send || this.E.at.isEmpty()) {
            return false;
        }
        A();
        y(true);
        C();
        return true;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        unregisterReceiver(this.y);
        twn twnVar = this.G;
        if (twnVar != null) {
            twnVar.a.d();
            twnVar.cancel(true);
            this.G = null;
        }
        two twoVar = this.H;
        if (twoVar != null) {
            twoVar.cancel(true);
            this.H = null;
        }
        aqxs aqxsVar = this.k;
        if (aqxsVar != null && (aqxsVar.q() || this.k.p())) {
            this.k.h();
        }
        asnb asnbVar = this.F;
        if (asnbVar != null && asnbVar.isRunning()) {
            this.F.stop();
        }
        super.onPause();
    }

    @Override // defpackage.qfw
    protected final void onResumeFragments() {
        aqxs aqxsVar;
        super.onResumeFragments();
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.appinvite.intent.action.INVITE_SENT");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        AppInviteResponseReceiver appInviteResponseReceiver = new AppInviteResponseReceiver();
        this.y = appInviteResponseReceiver;
        iln.b(this, appInviteResponseReceiver, intentFilter, 4);
        ArrayList arrayList = new ArrayList(this.z);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Long l = (Long) arrayList.get(i);
            l.longValue();
            if (AppInviteIntentOperation.b.a(l)) {
                l.longValue();
                twq twqVar = AppInviteIntentOperation.b;
                u(twqVar.a(l) ? (Intent) twqVar.a.get(l) : null);
            }
        }
        if ((!this.x || this.D.getDrawable() == null) && (aqxsVar = this.k) != null) {
            aqxsVar.g();
        }
        C();
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int size = this.z.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) this.z.get(i)).longValue();
        }
        bundle.putLongArray("pendingOperations", jArr);
        bundle.putString("sessionId", this.K);
        bundle.putParcelable("account", this.A);
        bundle.putString("message", this.p.getText().toString());
        bundle.putBoolean("messageFocused", this.w);
        bundle.putBoolean("messageLimitFirstEdit", this.N);
        bundle.putBoolean("messageLimitNearWarning", this.O);
        bundle.putBoolean("message_edited", this.v);
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        this.u.c();
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        this.u.d.h();
        super.onStop();
    }

    @Override // defpackage.tyq
    public final void p(ContactPerson contactPerson, int i, int i2, boolean z) {
        ContactPerson.ContactMethod a;
        twv twvVar = this.u;
        ekra ekraVar = null;
        if (contactPerson != null && (a = contactPerson.a()) != null) {
            fecj v = ekra.a.v();
            int i3 = a.a;
            if (i3 == 0) {
                if (!v.b.L()) {
                    v.U();
                }
                ekra ekraVar2 = (ekra) v.b;
                ekraVar2.c = 1;
                ekraVar2.b |= 1;
            } else if (i3 == 1) {
                if (!v.b.L()) {
                    v.U();
                }
                ekra ekraVar3 = (ekra) v.b;
                ekraVar3.c = 2;
                ekraVar3.b |= 1;
            } else if (i3 != 2) {
                if (!v.b.L()) {
                    v.U();
                }
                ekra ekraVar4 = (ekra) v.b;
                ekraVar4.c = 0;
                ekraVar4.b |= 1;
            } else {
                if (!v.b.L()) {
                    v.U();
                }
                ekra ekraVar5 = (ekra) v.b;
                ekraVar5.c = 3;
                ekraVar5.b |= 1;
            }
            ekraVar = (ekra) v.Q();
        }
        int a2 = ekrd.a(i);
        fecj v2 = ekre.a.v();
        if (a2 != 0) {
            if (!v2.b.L()) {
                v2.U();
            }
            ekre ekreVar = (ekre) v2.b;
            ekreVar.c = a2 - 1;
            ekreVar.b |= 1;
        }
        if (ekraVar != null) {
            if (!v2.b.L()) {
                v2.U();
            }
            ekre ekreVar2 = (ekre) v2.b;
            ekreVar2.d = ekraVar;
            ekreVar2.b |= 2;
        }
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        ekre ekreVar3 = (ekre) fecpVar;
        ekreVar3.b |= 4;
        ekreVar3.e = i2;
        if (!fecpVar.L()) {
            v2.U();
        }
        ekre ekreVar4 = (ekre) v2.b;
        ekreVar4.b |= 8;
        ekreVar4.f = z;
        twvVar.g((ekre) v2.Q(), 5, twvVar.b);
    }

    @Override // defpackage.tyq
    public final void q(boolean z) {
        twv twvVar = this.u;
        fecj v = ekrm.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ekrm ekrmVar = (ekrm) v.b;
        ekrmVar.b |= 1;
        ekrmVar.c = !z;
        twvVar.g((ekrm) v.Q(), 6, twvVar.b);
    }

    @Override // defpackage.tyr
    public final void r(ContactPerson contactPerson, boolean z) {
        if (z != this.E.at.isEmpty()) {
            supportInvalidateOptionsMenu();
        }
    }

    @Override // defpackage.tyq
    public final synchronized void s() {
        this.W = SystemClock.uptimeMillis() - this.T;
    }

    public final void t() {
        startActivityForResult(aqsy.b(this.A, new ArrayList(asnd.h(this, this.l)), new String[]{"com.google"}, true, false, 1), 1);
    }

    public final void u(Intent intent) {
        long longExtra = intent.getLongExtra("appOperationCode", -1L);
        Long valueOf = Long.valueOf(longExtra);
        if (!this.z.contains(valueOf)) {
            ubi.a(this, getString(R.string.appinvite_send_error), false, true);
            C();
            return;
        }
        this.z.remove(valueOf);
        valueOf.getClass();
        twq twqVar = AppInviteIntentOperation.b;
        Long valueOf2 = Long.valueOf(longExtra);
        HashMap hashMap = twqVar.a;
        if (hashMap.containsKey(valueOf2)) {
            hashMap.remove(valueOf2);
            twqVar.b.remove(valueOf2);
        }
        if (!intent.hasExtra("com.google.android.gms.appinvite.errorType")) {
            String[] stringArrayExtra = intent.getStringArrayExtra("appInviteResult");
            ubi.a(this, getString(R.string.appinvite_invitation_sent), false, false);
            Intent intent2 = new Intent();
            intent2.putExtra("com.google.android.gms.appinvite.RESULT_INVITATION_IDS", stringArrayExtra);
            setResult(-1, intent2);
            finish();
            y(true);
            return;
        }
        int intExtra = intent.getIntExtra("com.google.android.gms.appinvite.errorType", 0);
        if (intExtra == 1) {
            setResult(intent.getIntExtra("com.google.android.gms.appinvite.errorCode", 204));
            finish();
        } else if (intExtra == 2) {
            C();
            this.Y = 0L;
        } else if (intExtra != 3) {
            setResult(204);
            finish();
        } else {
            Intent intent3 = (Intent) intent.getParcelableExtra("com.google.android.gms.appinvite.authIntent");
            if (intent3 != null) {
                startActivityForResult(intent3, 2);
            } else {
                setResult(203);
                finish();
            }
        }
        if (isFinishing()) {
            y(false);
        } else {
            ubi.a(this, getString(R.string.appinvite_send_error), false, true);
        }
    }

    @Override // defpackage.tyh
    public final un v() {
        return this.m;
    }

    @Override // defpackage.aqzv
    public final void onConnectionSuspended(int i) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
