package com.google.android.gms.family.invites;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.family.AppContextProvider;
import com.google.android.gms.family.v2.model.ContactPerson;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import defpackage.a;
import defpackage.apzg;
import defpackage.atzb;
import defpackage.auur;
import defpackage.bbtr;
import defpackage.bbtt;
import defpackage.bbua;
import defpackage.bbud;
import defpackage.bbuf;
import defpackage.bbuq;
import defpackage.bbuy;
import defpackage.bbvc;
import defpackage.bbvd;
import defpackage.bbve;
import defpackage.bbvf;
import defpackage.bbvg;
import defpackage.bbvh;
import defpackage.bbvj;
import defpackage.bbvn;
import defpackage.caqj;
import defpackage.esfu;
import defpackage.eshd;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.jzx;
import defpackage.qze;
import defpackage.qzh;
import defpackage.qzn;
import defpackage.rxx;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SendInvitationsChimeraActivity extends rxx implements View.OnClickListener, bbvc, bbud {
    private static final int[] r = {1, 2, 3, 4};
    private ViewGroup A;
    private ViewGroup B;
    private ViewGroup C;
    private boolean H;
    private boolean I;
    private String J;
    private bbvn K;
    private PageData R;
    private PageData S;
    private PageData T;
    public WalletCustomTheme j;
    public String k;
    public bbvj m;
    public ResultReceiver n;
    public bbtt o;
    public bbtr p;
    private int s;
    private jzx t;
    private SmsSentReceiver u;
    private bbvd v;
    private ViewGroup z;
    public ArrayList l = new ArrayList();
    private final SparseArray w = new SparseArray();
    private boolean x = false;
    private ArrayList y = new ArrayList();
    private int D = 0;
    private int E = 0;
    private int F = 0;
    private boolean G = false;
    private boolean L = false;
    private int M = 0;
    private int N = 0;
    private int O = 0;
    private int P = 0;
    private String Q = "2";
    public eshd q = eshd.UNKNOWN_FAMILY_ROLE;
    private ContactPickerOptionsData U = new ContactPickerOptionsData(esfu.a);

    private final void A() {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        z(3);
        PageData pageData = this.S;
        if (pageData != null && (hashMap4 = pageData.a) != null && hashMap4.containsKey(2)) {
            y(this.B, (String) this.S.a.get(2));
        }
        RecyclerView recyclerView = (RecyclerView) this.B.findViewById(R.id.fm_invitations_failed_list);
        recyclerView.aj(new LinearLayoutManager());
        List w = w(new HashSet(Arrays.asList(7, 13)));
        PageData pageData2 = this.S;
        if (pageData2 != null && (hashMap3 = pageData2.a) != null && hashMap3.containsKey(3)) {
            TextView textView = (TextView) this.B.findViewById(R.id.fm_invitations_retry_error_title);
            PageData pageData3 = this.S;
            atzb.s(pageData3);
            bbuq.a(textView, (String) pageData3.a.get(3), new bbuf(this.S, this, this.k));
        }
        recyclerView.ah(new bbuy(w, true, this));
        Button button = (Button) this.B.findViewById(R.id.fm_invitations_skip_retry_button);
        PageData pageData4 = this.S;
        if (pageData4 != null && (hashMap2 = pageData4.a) != null && hashMap2.containsKey(5)) {
            button.setText((CharSequence) this.S.a.get(5));
        }
        button.setOnClickListener(this);
        Button button2 = (Button) this.B.findViewById(R.id.fm_invitations_retry_now_button);
        PageData pageData5 = this.S;
        if (pageData5 != null && (hashMap = pageData5.a) != null && hashMap.containsKey(4)) {
            button2.setText((CharSequence) this.S.a.get(4));
        }
        button2.setOnClickListener(this);
    }

    private final void B(int i, boolean z) {
        Contact contact;
        int i2;
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                contact = null;
                break;
            }
            contact = (Contact) arrayList.get(i3);
            i3++;
            if (contact.d == i) {
                break;
            }
        }
        if (contact == null) {
            Log.w("Family", String.format(Locale.US, a.j(i, "[SendInvChimeraAct] Failed to find contact in array, contactId:"), new Object[0]));
            return;
        }
        int i4 = contact.j;
        if (z) {
            i2 = i4 != 10 ? 11 : 12;
        } else if (i4 != 1) {
            if (i4 != 5) {
                if (i4 != 6 && i4 != 7) {
                    if (i4 != 9) {
                        if (i4 != 10) {
                            return;
                        }
                    }
                }
                i2 = 14;
            }
            i2 = 13;
        } else {
            i2 = 7;
        }
        contact.j = i2;
    }

    private final boolean C() {
        return getIntent().getBooleanExtra("isDirectAddInvitations", false);
    }

    private final boolean D() {
        return getIntent().getBooleanExtra("isOnboardInvitations", false);
    }

    private final List w(Set set) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.l;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            Contact contact = (Contact) arrayList2.get(i);
            if (set.contains(Integer.valueOf(contact.j))) {
                arrayList.add(contact);
            }
        }
        return arrayList;
    }

    private final void x(Contact contact, boolean z) {
        String.valueOf(contact);
        this.t.c(contact.d + 10000, null, new bbvf(this, contact, z));
    }

    private final void y(ViewGroup viewGroup, String str) {
        Toolbar toolbar = (Toolbar) viewGroup.findViewById(R.id.fm_toolbar);
        toolbar.B(auur.c(str));
        if (D()) {
            toolbar.D(-16777216);
            toolbar.setBackgroundResource(android.R.color.white);
        }
    }

    private final void z(int i) {
        this.s = i;
        int[] iArr = r;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[i2];
            (i3 != 2 ? i3 != 3 ? i3 != 4 ? this.z : this.C : this.B : this.A).setVisibility(i3 == i ? 0 : 8);
        }
    }

    @Override // defpackage.bbvc
    public final void a() {
        int i = this.s;
        if (i != 1) {
            if (i == 2) {
                t();
                return;
            } else if (i == 3) {
                A();
                return;
            } else {
                if (i != 4) {
                    return;
                }
                u();
                return;
            }
        }
        if (this.H) {
            return;
        }
        this.H = true;
        this.K.g(this.L, 10);
        this.U.g = getIntent().getIntExtra("max-available-slots", 5);
        if (C()) {
            this.U.a(new int[]{0});
        } else {
            this.U.a(new int[]{0});
        }
        Intent putExtra = new Intent().setClassName(this, "com.google.android.gms.family.v2.invites.contactpicker.ContactPickerActivity").putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", auur.c(getIntent().getStringExtra("predefinedTheme"))).putExtra("contactPickerOptions", this.U);
        if (C() && Objects.equals(this.J, "agsa")) {
            startActivityForResult(putExtra, 3);
        } else {
            startActivityForResult(putExtra, 1);
        }
    }

    final synchronized int k(int i) {
        bbvh bbvhVar;
        bbvhVar = (bbvh) this.w.get(i, new bbvh());
        return bbvhVar.a + bbvhVar.b;
    }

    final void l(String str, int i) {
        this.D = 0;
        this.E = 0;
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Contact contact = (Contact) arrayList.get(i2);
            int i3 = contact.j;
            if (i3 == 1) {
                contact.j = 3;
            } else if (i3 == 7) {
                contact.j = 4;
            }
        }
        String stringExtra = getIntent().getStringExtra("appId");
        atzb.s(stringExtra);
        this.t.c(i, null, new bbve(this, stringExtra, str));
    }

    public final void m(int i, int i2) {
        Intent intent = new Intent();
        intent.putExtra("num-invitations-sent", i2);
        intent.putExtra("num-invitations-created", this.E + this.D);
        if (C() && "agsa".equals(this.J)) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("direct-add-contacts-list", new ArrayList<>(w(new HashSet(Arrays.asList(15)))));
            intent.putExtras(bundle);
        }
        this.o.b();
        intent.putExtra("consistencyToken", this.o.b());
        intent.putExtra("tokenExpirationTimeSecs", this.o.a());
        setResult(i, intent);
        ArrayList arrayList = this.l;
        if (arrayList != null && !arrayList.isEmpty()) {
            bbvn bbvnVar = this.K;
            boolean z = this.L;
            int i3 = this.M;
            int i4 = this.N;
            int i5 = this.O;
            int i6 = this.P;
            fgrc v = qze.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            qze qzeVar = (qze) fgriVar;
            qzeVar.c = 3;
            qzeVar.b = 1 | qzeVar.b;
            if (!fgriVar.L()) {
                v.U();
            }
            fgri fgriVar2 = v.b;
            qze qzeVar2 = (qze) fgriVar2;
            qzeVar2.b |= 2;
            qzeVar2.d = i3;
            if (!fgriVar2.L()) {
                v.U();
            }
            fgri fgriVar3 = v.b;
            qze qzeVar3 = (qze) fgriVar3;
            qzeVar3.b |= 4;
            qzeVar3.e = i4;
            if (!fgriVar3.L()) {
                v.U();
            }
            fgri fgriVar4 = v.b;
            qze qzeVar4 = (qze) fgriVar4;
            qzeVar4.b |= 8;
            qzeVar4.f = i5;
            if (!fgriVar4.L()) {
                v.U();
            }
            qze qzeVar5 = (qze) v.b;
            qzeVar5.b |= 16;
            qzeVar5.g = i6;
            qze qzeVar6 = (qze) v.Q();
            if (z) {
                fgrc v2 = qzn.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                qzn qznVar = (qzn) v2.b;
                qzeVar6.getClass();
                qznVar.d = qzeVar6;
                qznVar.b |= 2;
                bbvnVar.c((qzn) v2.Q());
            } else {
                fgrc v3 = qzh.a.v();
                if (!v3.b.L()) {
                    v3.U();
                }
                qzh qzhVar = (qzh) v3.b;
                qzeVar6.getClass();
                qzhVar.d = qzeVar6;
                qzhVar.b |= 2;
                bbvnVar.b((qzh) v3.Q());
            }
        }
        finish();
    }

    final synchronized void n(int i, boolean z) {
        bbvh bbvhVar = new bbvh();
        SparseArray sparseArray = this.w;
        bbvh bbvhVar2 = (bbvh) sparseArray.get(i, bbvhVar);
        if (z) {
            bbvhVar2.a++;
        } else {
            bbvhVar2.b++;
        }
        sparseArray.put(i, bbvhVar2);
    }

    public final void o() {
        p(this.l);
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1 && i != 3) {
            if (i == 2) {
                this.v.a();
                return;
            }
            return;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                return;
            }
            m(0, 0);
            return;
        }
        ArrayList<ContactPerson> arrayList = new ArrayList();
        atzb.s(intent);
        if (intent.getParcelableArrayListExtra("selectedContacts") != null) {
            atzb.s(intent);
            arrayList = intent.getParcelableArrayListExtra("selectedContacts");
            atzb.s(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (ContactPerson contactPerson : arrayList) {
            ContactPerson.ContactMethod contactMethod = (ContactPerson.ContactMethod) contactPerson.d.get(0);
            Contact contact = new Contact();
            contact.b = contactPerson.a;
            int i6 = i5 + 1;
            contact.d = i5;
            contact.g = contactPerson.c;
            int i7 = contactMethod.a;
            if (i7 == 1) {
                contact.a = contactMethod.b;
                i3++;
            } else if (i7 == 0) {
                contact.c = contactMethod.b;
                i4++;
            }
            contact.j = 1;
            arrayList2.add(contact);
            i5 = i6;
        }
        this.M = i3;
        this.N = i4;
        this.l = arrayList2;
        if (arrayList2.isEmpty()) {
            m(-1, 0);
            return;
        }
        t();
        if (i == 1) {
            l(this.k, 2000);
        } else {
            this.t.c(2000, null, new bbvg(this, this.J, this.l));
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        int i = this.s;
        if (i == 1) {
            super.onBackPressed();
        } else if (i != 2) {
            m(0, this.F);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        HashMap hashMap;
        if (view.getId() == R.id.fm_invitations_skip_retry_button) {
            m(-1, this.F);
            return;
        }
        if (view.getId() == R.id.fm_invitations_skip_failures_button) {
            m(-1, this.F);
            return;
        }
        if (view.getId() == R.id.fm_invitations_retry_now_button) {
            this.y.clear();
            this.w.clear();
            if (this.x) {
                l(this.k, 3000);
            } else {
                String str = this.k;
                this.D = 0;
                this.E = 0;
                HashSet hashSet = new HashSet(Collections.singletonList(13));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = this.l;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    Contact contact = (Contact) arrayList2.get(i);
                    if (hashSet.contains(Integer.valueOf(contact.j)) && contact.b()) {
                        arrayList.add(contact);
                        contact.j = 10;
                    }
                }
                this.m.a(arrayList, str);
            }
            this.G = true;
            z(2);
            PageData pageData = this.T;
            if (pageData == null || (hashMap = pageData.a) == null || !hashMap.containsKey(2)) {
                return;
            }
            y(this.A, (String) this.T.a.get(2));
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("clientCallingPackage");
        if (stringExtra != null) {
            bbua.d(this, getIntent(), stringExtra);
            this.Q = Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion);
        }
        this.t = getSupportLoaderManager();
        setContentView(R.layout.fm_invitations_base);
        this.o = new bbtt();
        if (getIntent().getStringExtra("consistencyToken") != null) {
            this.o.c(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0L));
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.fm_invitations_startup_page);
        this.z = viewGroup;
        y(viewGroup, getString(R.string.fm_invitations_invite_family_title));
        this.A = (ViewGroup) findViewById(R.id.fm_invitations_sending);
        this.B = (ViewGroup) findViewById(R.id.fm_invitations_retry_error);
        this.C = (ViewGroup) findViewById(R.id.fm_invitations_skip_failures);
        this.n = new SendInvitationsResultReceiver(new caqj(Looper.getMainLooper()), new WeakReference(this));
        String stringExtra2 = getIntent().getStringExtra("accountName");
        atzb.s(stringExtra2);
        this.k = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("appId");
        atzb.s(stringExtra3);
        this.J = stringExtra3;
        eshd b = eshd.b(getIntent().getIntExtra("inviteeRole", 3));
        atzb.s(b);
        this.q = b;
        this.p = new bbtr(this.J, this.Q);
        this.T = (PageData) getIntent().getParcelableExtra("invitesSendingPagedata");
        this.S = (PageData) getIntent().getParcelableExtra("invitesRetryPagedata");
        this.R = (PageData) getIntent().getParcelableExtra("invitesRetryLaterPagedata");
        if (getIntent().getParcelableExtra("contactPickerOptions") != null) {
            ContactPickerOptionsData contactPickerOptionsData = (ContactPickerOptionsData) getIntent().getParcelableExtra("contactPickerOptions");
            atzb.s(contactPickerOptionsData);
            this.U = contactPickerOptionsData;
        }
        int a = bbua.a(getIntent());
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.g(apzg.a(this, a));
        this.j = walletCustomTheme;
        this.L = D();
        bbvn bbvnVar = new bbvn(this);
        this.K = bbvnVar;
        bbvnVar.d(this.k, this.Q, this.J);
        this.K.g(this.L, 2);
        this.u = new SmsSentReceiver(this.n);
        AppContextProvider.a();
        SmsManager smsManager = SmsManager.getDefault();
        atzb.s(smsManager);
        this.m = new bbvj(this, smsManager);
        getApplicationContext().registerReceiver(this.u, new IntentFilter("com.google.android.gms.family.invites"));
        if (bundle != null) {
            this.s = bundle.getInt("currentState");
            if (bundle.getParcelableArrayList("selectedContacts") != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("selectedContacts");
                atzb.s(parcelableArrayList);
                this.l = parcelableArrayList;
            }
            this.H = bundle.getBoolean("selectionActivityLaunched");
            this.I = bundle.getBoolean("permissionRecoveryLaunched");
            this.x = bundle.getBoolean("creationFailed");
            if (bundle.getParcelableArrayList("failedSendingContacts") != null) {
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("failedSendingContacts");
                atzb.s(parcelableArrayList2);
                this.y = parcelableArrayList2;
            }
            this.D = bundle.getInt("numInvitationsSentSuccessfully");
            this.E = bundle.getInt("numInvitationsSendingFailures");
            this.F = bundle.getInt("numInvited");
            this.G = bundle.getBoolean("retried");
        } else {
            this.s = 1;
            this.H = false;
        }
        bbvd bbvdVar = new bbvd(this);
        this.v = bbvdVar;
        if (this.I) {
            a();
        } else {
            bbvdVar.a();
            this.I = true;
        }
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        bbvn bbvnVar = this.K;
        if (bbvnVar != null) {
            bbvnVar.g(this.L, 3);
        }
        getApplicationContext().unregisterReceiver(this.u);
        super.onDestroy();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onResume() {
        super.onResume();
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("selectionActivityLaunched", this.H);
        bundle.putBoolean("permissionRecoveryLaunched", this.I);
        bundle.putInt("currentState", this.s);
        bundle.putParcelableArrayList("selectedContacts", this.l);
        bundle.putBoolean("creationFailed", this.x);
        bundle.putParcelableArrayList("failedSendingContacts", this.y);
        bundle.putInt("numInvitationsSentSuccessfully", this.D);
        bundle.putInt("numInvitationsSendingFailures", this.E);
        bundle.putInt("numInvited", this.F);
        bundle.putBoolean("retried", this.G);
    }

    public final void p(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.x = true;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Contact contact = (Contact) it.next();
            this.y.add(contact);
            int i = contact.j;
            if (i == 3) {
                contact.j = 7;
            } else if (i == 4) {
                contact.j = 8;
            }
        }
        v();
    }

    public final void q(Contact contact, boolean z) {
        String.valueOf(contact);
        B(contact.d, z);
        v();
    }

    final void r(Contact contact) {
        this.E++;
        this.y.add(contact);
        if (!TextUtils.isEmpty(contact.f)) {
            x(contact, false);
        } else {
            B(contact.d, false);
            v();
        }
    }

    public final void s(Contact contact) {
        if (contact.b()) {
            n(contact.d, true);
            if (k(contact.d) < contact.h) {
                return;
            }
            if (((bbvh) this.w.get(contact.d, new bbvh())).b != 0) {
                r(contact);
                return;
            }
        }
        this.D++;
        this.F++;
        if (contact.b()) {
            this.O++;
        } else {
            this.P++;
        }
        if (contact.b()) {
            x(contact, true);
        } else {
            B(contact.d, true);
            v();
        }
    }

    final void t() {
        HashMap hashMap;
        z(2);
        PageData pageData = this.T;
        if (pageData == null || (hashMap = pageData.a) == null || !hashMap.containsKey(2)) {
            return;
        }
        y(this.A, (String) this.T.a.get(2));
    }

    public final void u() {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        z(4);
        PageData pageData = this.R;
        if (pageData != null && (hashMap3 = pageData.a) != null && hashMap3.containsKey(2)) {
            y(this.C, (String) this.R.a.get(2));
        }
        RecyclerView recyclerView = (RecyclerView) this.C.findViewById(R.id.fm_invitations_failed_list);
        recyclerView.aj(new LinearLayoutManager());
        List w = w(new HashSet(Arrays.asList(8, 14, 16)));
        PageData pageData2 = this.R;
        if (pageData2 != null && (hashMap2 = pageData2.a) != null && hashMap2.containsKey(3)) {
            TextView textView = (TextView) this.C.findViewById(R.id.fm_invitations_text_skip_failures_title);
            PageData pageData3 = this.R;
            atzb.s(pageData3);
            bbuq.a(textView, (String) pageData3.a.get(3), new bbuf(this.R, this, this.k));
        }
        recyclerView.ah(new bbuy(w, true, this));
        Button button = (Button) this.C.findViewById(R.id.fm_invitations_skip_failures_button);
        TextView textView2 = (TextView) this.C.findViewById(R.id.fm_invitations_skip_list_header);
        if (C()) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(R.string.fm_invitations_text_invitations);
            textView2.setVisibility(0);
        }
        PageData pageData4 = this.R;
        if (pageData4 != null && (hashMap = pageData4.a) != null && hashMap.containsKey(4)) {
            button.setText((CharSequence) this.R.a.get(4));
        }
        button.setOnClickListener(this);
    }

    public final void v() {
        int i = 0;
        HashSet hashSet = new HashSet(Arrays.asList(1, 3, 4, 9, 10));
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        while (i < size) {
            boolean contains = hashSet.contains(Integer.valueOf(((Contact) arrayList.get(i)).j));
            i++;
            if (contains) {
                return;
            }
        }
        if (this.y.isEmpty()) {
            m(-1, this.F);
        } else if (this.G) {
            u();
        } else {
            A();
        }
    }

    @Override // defpackage.bbud
    public final Context getContext() {
        return this;
    }
}
