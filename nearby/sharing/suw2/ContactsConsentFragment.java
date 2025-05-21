package com.google.android.gms.nearby.sharing.suw2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.DeviceVisibility;
import com.google.android.gms.nearby.sharing.suw2.ContactsConsentFragment;
import com.google.android.setupdesign.GlifLayout;
import defpackage.abt;
import defpackage.abv;
import defpackage.cmdb;
import defpackage.cmfd;
import defpackage.cmfe;
import defpackage.crkh;
import defpackage.crki;
import defpackage.crkj;
import defpackage.crkk;
import defpackage.crkl;
import defpackage.crkm;
import defpackage.crkx;
import defpackage.crla;
import defpackage.crle;
import defpackage.dtjb;
import defpackage.edeq;
import defpackage.edfq;
import defpackage.edfr;
import defpackage.edfs;
import defpackage.edgl;
import defpackage.edif;
import defpackage.edit;
import defpackage.ediw;
import defpackage.edja;
import defpackage.edjs;
import defpackage.eygi;
import defpackage.fqmn;
import defpackage.fuuw;
import defpackage.fuux;
import defpackage.fuuy;
import defpackage.fuvb;
import defpackage.fuwt;
import defpackage.fuxd;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.fvgt;
import defpackage.joo;
import defpackage.jqx;
import defpackage.mds;
import defpackage.mhw;
import defpackage.mmh;
import defpackage.qfp;
import defpackage.qfq;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ContactsConsentFragment extends crla {
    public static final /* synthetic */ int b = 0;
    private static final Map c = fuxd.f(new fuvb(".grey600", Integer.valueOf(R.color.lottie_dark_grey600)), new fuvb(".grey700", Integer.valueOf(R.color.lottie_dark_grey700)), new fuvb(".grey800", Integer.valueOf(R.color.lottie_dark_grey800)), new fuvb(".black", Integer.valueOf(R.color.lottie_dark_black)), new fuvb(".white", Integer.valueOf(R.color.lottie_dark_white)));
    public abv a;
    private final fuuw d;

    public ContactsConsentFragment() {
        fuuw a = fuux.a(fuuy.c, new crkj(new crki(this)));
        int i = fvcc.a;
        this.d = new jqx(new fvbi(crkx.class), new crkk(a), new crkm(this, a), new crkl(a));
    }

    public final void A() {
        qfp a = qfq.a(this);
        if (!edgl.b(a.getIntent())) {
            cmfe.a.c().p("No setup wizard manager found.", new Object[0]);
            a.setResult(-1);
            a.finish();
            return;
        }
        if (fvbo.n(a.getIntent().getAction(), "com.google.android.gms.nearby.sharing.SETUP_WRAPPED")) {
            cmfe.a.b().h("Setup activity is wrapped, finishing with result code: %d", -1);
            a.setResult(-1);
            a.finish();
            return;
        }
        Intent intent = a.getIntent();
        Intent intent2 = new Intent("com.android.wizard.NEXT");
        edgl.a(intent, intent2);
        intent2.putExtra("com.android.setupwizard.ResultCode", -1);
        intent2.putExtra("theme", intent.getStringExtra("theme"));
        if (Build.VERSION.SDK_INT >= 24) {
            List<ResolveInfo> queryIntentActivities = requireContext().getPackageManager().queryIntentActivities(intent2, 1048576);
            fvbo.e(queryIntentActivities, "queryIntentActivities(...)");
            if (fuwt.N(queryIntentActivities) == null) {
                throw new IllegalStateException("No wizard manager in system image found.");
            }
        }
        cmfe.a.b().p("Setup activity is not wrapped, launching next activity.", new Object[0]);
        abv abvVar = this.a;
        if (abvVar == null) {
            fvbo.j("setupWizardLauncher");
            abvVar = null;
        }
        abvVar.b(intent2);
    }

    @Override // defpackage.dg
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().b(new cmfd(this, eygi.USE_CASE_SETUP_WIZARD, cmdb.f(getContext())));
        this.a = registerForActivityResult(new dtjb(), new abt() { // from class: crkc
            @Override // defpackage.abt
            public final void jq(Object obj) {
                int i = ContactsConsentFragment.b;
                fvbo.f((msg) obj, "it");
            }
        });
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fvbo.f(layoutInflater, "inflater");
        Context requireContext = requireContext();
        int i = edjs.a;
        return layoutInflater.inflate(true != edeq.s(requireContext) ? R.layout.sharing_suw2_consent_fragment_v2 : R.layout.sharing_suw2_consent_fragment_v2_bc25, viewGroup, false);
    }

    @Override // defpackage.dg
    public final void onViewCreated(View view, Bundle bundle) {
        fvbo.f(view, "view");
        TextView textView = (TextView) view.findViewById(R.id.how_it_works);
        fvbo.c(textView);
        crle.a(textView, 20.0f);
        TextView textView2 = (TextView) view.findViewById(R.id.contacts_upload_title);
        fvbo.c(textView2);
        crle.a(textView2, 24.0f);
        TextView textView3 = (TextView) view.findViewById(R.id.contacts_upload_description);
        fvbo.c(textView3);
        crle.a(textView3, 20.0f);
        if (fqmn.a.a().K()) {
            GlifLayout glifLayout = (GlifLayout) view.findViewById(R.id.glif_layout);
            fvbo.c(glifLayout);
            fvbo.f(glifLayout, "<this>");
            edif edifVar = (edif) glifLayout.q(edif.class);
            if (edifVar != null) {
                edifVar.a().setMaxLines(10);
            }
        }
        Context requireContext = requireContext();
        int i = edjs.a;
        if (!edeq.s(requireContext)) {
            final LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.animation);
            fvbo.c(lottieAnimationView);
            for (Map.Entry entry : c.entrySet()) {
                String str = (String) entry.getKey();
                final int color = lottieAnimationView.getContext().getColor(((Number) entry.getValue()).intValue());
                lottieAnimationView.c(new mhw("**", str, "**"), mds.K, new mmh() { // from class: crjy
                    @Override // defpackage.mmh
                    public final Object a() {
                        int i2 = ContactsConsentFragment.b;
                        return new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP);
                    }
                });
            }
            lottieAnimationView.setOnClickListener(new View.OnClickListener() { // from class: crkb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i2 = ContactsConsentFragment.b;
                    LottieAnimationView lottieAnimationView2 = LottieAnimationView.this;
                    if (lottieAnimationView2.t()) {
                        lottieAnimationView2.f();
                    } else {
                        lottieAnimationView2.i();
                    }
                }
            });
        }
        ((Button) view.findViewById(R.id.learn_more_link)).setOnClickListener(new View.OnClickListener() { // from class: crjx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                new crke().show(ContactsConsentFragment.this.getParentFragmentManager(), "LearnMoreDialog");
            }
        });
        GlifLayout glifLayout2 = (GlifLayout) view.findViewById(R.id.glif_layout);
        fvbo.c(glifLayout2);
        fvbo.f(glifLayout2, "<this>");
        edfq edfqVar = (edfq) glifLayout2.q(edfq.class);
        if (edfqVar != null) {
            edfr edfrVar = new edfr(requireContext());
            edfrVar.b(R.string.common_no_thanks);
            edfrVar.b = new View.OnClickListener() { // from class: crjz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ContactsConsentFragment contactsConsentFragment = ContactsConsentFragment.this;
                    final crkx x = contactsConsentFragment.x();
                    cmaz cmazVar = x.a;
                    x.a("SharingClient#reset()", cmazVar.v());
                    x.a("SharingClient#optIn()", cmazVar.q());
                    x.a("SharingClient#setVisibility(SELF_SHARE)", cmazVar.C(4));
                    x.a("SharingClient#setEnabled(true)", cmazVar.K());
                    if (fqmn.z()) {
                        fvgt.b(jqw.a(x), fvkm.a, null, new crkw(x, null), 2);
                    }
                    if (fqmk.i()) {
                        dfaq i2 = cmazVar.i();
                        final fvaq fvaqVar = new fvaq() { // from class: crko
                            @Override // defpackage.fvaq
                            public final Object a(Object obj) {
                                DeviceVisibility deviceVisibility = (DeviceVisibility) obj;
                                crkx.this.b.i(cmdh.t(deviceVisibility.f, deviceVisibility.g));
                                return fuvs.a;
                            }
                        };
                        i2.z(new dfak() { // from class: crkp
                            @Override // defpackage.dfak
                            public final void gn(Object obj) {
                                fvaq.this.a(obj);
                            }
                        });
                        i2.y(new dfah() { // from class: crkq
                            @Override // defpackage.dfah
                            public final void gm(Exception exc) {
                                crkx.this.b.i(cmdh.t(4, -1));
                            }
                        });
                    } else {
                        x.b.i(cmdh.t(4, -1));
                    }
                    contactsConsentFragment.A();
                }
            };
            edfrVar.c = 7;
            edfrVar.d = R.style.SudGlifButton_Secondary;
            edfqVar.c(edfrVar.a());
            edfr edfrVar2 = new edfr(requireContext());
            edfrVar2.b(R.string.sharing_suw2_agree);
            edfrVar2.c = 5;
            edfrVar2.d = R.style.SudGlifButton_Primary;
            edfqVar.b(edfrVar2.a());
            fvbo.f(glifLayout2, "<this>");
            edja edjaVar = (edja) glifLayout2.q(edja.class);
            if (edjaVar != null) {
                Context requireContext2 = requireContext();
                edfs edfsVar = edfqVar.i;
                edfs edfsVar2 = edfqVar.j;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: crka
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ContactsConsentFragment contactsConsentFragment = ContactsConsentFragment.this;
                        final crkx x = contactsConsentFragment.x();
                        cmaz cmazVar = x.a;
                        x.a("SharingClient#optIn()", cmazVar.q());
                        x.a("SharingClient#consentToContactsUpload()", cmazVar.c());
                        x.a("SharingClient#setVisibility(ALL_CONTACTS)", cmazVar.C(1));
                        x.a("SharingClient#setEnabled(true)", cmazVar.K());
                        if (fqmn.z()) {
                            fvgt.b(jqw.a(x), fvkm.a, null, new crkv(x, null), 2);
                        }
                        if (fqmk.i()) {
                            dfaq i2 = cmazVar.i();
                            final fvaq fvaqVar = new fvaq() { // from class: crkr
                                @Override // defpackage.fvaq
                                public final Object a(Object obj) {
                                    DeviceVisibility deviceVisibility = (DeviceVisibility) obj;
                                    crkx.this.b.i(cmdh.t(deviceVisibility.f, deviceVisibility.g));
                                    return fuvs.a;
                                }
                            };
                            i2.z(new dfak() { // from class: crks
                                @Override // defpackage.dfak
                                public final void gn(Object obj) {
                                    fvaq.this.a(obj);
                                }
                            });
                            i2.y(new dfah() { // from class: crkt
                                @Override // defpackage.dfah
                                public final void gm(Exception exc) {
                                    crkx.this.b.i(cmdh.t(1, -1));
                                }
                            });
                        } else {
                            x.b.i(cmdh.t(1, -1));
                        }
                        contactsConsentFragment.A();
                    }
                };
                CharSequence text = requireContext2.getText(R.string.common_more);
                Context context = edjaVar.c.getContext();
                if (edeq.s(context)) {
                    edjaVar.c(context, onClickListener);
                } else {
                    CharSequence charSequence = edfsVar.b;
                    edfsVar.f = new edit(edjaVar, onClickListener);
                    edjaVar.d = new ediw(edfsVar, text, charSequence, edfsVar2);
                    edjaVar.b();
                }
            }
        }
        fvgt.b(joo.a(this), null, null, new crkh(this, view, null), 3);
    }

    public final crkx x() {
        return (crkx) this.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(android.view.View r7, defpackage.fuyp r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.crkf
            if (r0 == 0) goto L13
            r0 = r8
            crkf r0 = (defpackage.crkf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            crkf r0 = new crkf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fuzb r1 = defpackage.fuzb.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r7 = r0.a
            defpackage.fuve.b(r8)
            goto L93
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fuve.b(r8)
            android.content.Context r8 = r6.requireContext()
            bqna r8 = defpackage.bqna.b(r8)
            java.lang.String r2 = "com.google"
            android.accounts.Account[] r8 = r8.p(r2)
            defpackage.fvbo.c(r8)
            java.lang.String r2 = "<this>"
            defpackage.fvbo.f(r8, r2)
            int r2 = r8.length
            if (r2 != 0) goto L4f
            r8 = 0
            goto L52
        L4f:
            r2 = 0
            r8 = r8[r2]
        L52:
            if (r8 == 0) goto La6
            crkx r2 = r6.x()
            cmaz r4 = r2.a
            dfaq r4 = r4.x(r8)
            java.lang.String r5 = "SharingClient#setAccount(account)"
            r2.a(r5, r4)
            android.content.Context r2 = r6.getContext()
            cmdb r2 = defpackage.cmdb.f(r2)
            android.content.Context r4 = r6.getContext()
            r2.h(r4, r8)
            r2 = 2131430278(0x7f0b0b86, float:1.8482252E38)
            android.view.View r7 = r7.findViewById(r2)
            com.google.android.setupdesign.GlifLayout r7 = (com.google.android.setupdesign.GlifLayout) r7
            if (r7 != 0) goto L7e
            goto La2
        L7e:
            edim r2 = defpackage.crkz.a(r7)
            if (r2 == 0) goto L89
            java.lang.String r4 = r8.name
            r2.g(r4)
        L89:
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.z(r8, r0)
            if (r8 == r1) goto La5
        L93:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            if (r8 == 0) goto La2
            com.google.android.setupdesign.GlifLayout r7 = (com.google.android.setupdesign.GlifLayout) r7
            edim r7 = defpackage.crkz.a(r7)
            if (r7 == 0) goto La2
            r7.e(r8)
        La2:
            fuvs r7 = defpackage.fuvs.a
            return r7
        La5:
            return r1
        La6:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "device must have at least one Google account"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.sharing.suw2.ContactsConsentFragment.y(android.view.View, fuyp):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(android.accounts.Account r5, defpackage.fuyp r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.crkg
            if (r0 == 0) goto L13
            r0 = r6
            crkg r0 = (defpackage.crkg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crkg r0 = new crkg
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fuzb r1 = defpackage.fuzb.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.fuve.b(r6)
            fuvd r6 = (defpackage.fuvd) r6
            java.lang.Object r5 = r6.a
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fuve.b(r6)
            android.content.Context r6 = r4.getContext()
            dfaq r5 = defpackage.crll.c(r6, r5)
            r0.c = r3
            java.lang.Object r5 = defpackage.cmfs.c(r5, r0)
            if (r5 == r1) goto L5c
        L46:
            boolean r6 = r5 instanceof defpackage.fuvc
            r0 = 0
            if (r3 != r6) goto L4c
            r5 = r0
        L4c:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r5 != 0) goto L51
            return r0
        L51:
            android.content.Context r6 = r4.getContext()
            r0 = 1103101952(0x41c00000, float:24.0)
            android.graphics.drawable.Drawable r5 = defpackage.crno.g(r6, r5, r0)
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.sharing.suw2.ContactsConsentFragment.z(android.accounts.Account, fuyp):java.lang.Object");
    }
}
