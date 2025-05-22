package com.google.android.gms.people.consentprimitive;

import android.R;
import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.people.consentprimitive.ContactsConsentData;
import com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveChimeraActivity;
import com.google.android.gms.people.consentprimitive.ContactsConsentPrimitiveViewModel$ConsentUiData;
import com.google.android.gms.people.consentprimitive.ContactsConsentsResults;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionRequest;
import defpackage.atzs;
import defpackage.auqx;
import defpackage.cvyz;
import defpackage.cwai;
import defpackage.cwca;
import defpackage.cwcc;
import defpackage.cwcd;
import defpackage.cwce;
import defpackage.cwcf;
import defpackage.cwcl;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.elhz;
import defpackage.enya;
import defpackage.enyc;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.ftta;
import defpackage.jvs;
import defpackage.jwo;
import defpackage.jxw;
import defpackage.ryt;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ContactsConsentPrimitiveChimeraActivity extends ryt {
    public cwce j;

    public final void a() {
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        findViewById(com.google.android.gms.R.id.root).setBackgroundColor(getColor(typedValue.resourceId));
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        eqgl i;
        ekvi j;
        GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest;
        super.onCreate(bundle);
        if (!ftta.d()) {
            finish();
            return;
        }
        setTheme(com.google.android.gms.R.style.ContactsPrimitiveActivityNoUiTheme);
        setContentView(com.google.android.gms.R.layout.consent_primitive_activity);
        GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest2 = new GetBackupSyncSuggestionRequest(8, 3);
        Intent intent = getIntent();
        if (intent != null && (getBackupSyncSuggestionRequest = (GetBackupSyncSuggestionRequest) atzs.b(intent, "sheepdogRequest", GetBackupSyncSuggestionRequest.CREATOR)) != null) {
            getBackupSyncSuggestionRequest2 = getBackupSyncSuggestionRequest;
        }
        cwce cwceVar = (cwce) new jxw(this, new cwcf(this, this, getBackupSyncSuggestionRequest2)).a(cwce.class);
        this.j = cwceVar;
        int a = enyc.a(getIntent().getIntExtra("referrer", 0));
        cwceVar.i = a;
        if (a == 0) {
            cwceVar.i = 1;
        }
        cwce cwceVar2 = this.j;
        ContactsConsentsStatus contactsConsentsStatus = (ContactsConsentsStatus) atzs.b(getIntent(), "status", new cwcl());
        jwo jwoVar = cwceVar2.b;
        if (!jwoVar.a.a.containsKey("ui-data")) {
            if (contactsConsentsStatus != null) {
                ContactsConsentsConfig contactsConsentsConfig = contactsConsentsStatus.c;
                Account account = contactsConsentsConfig.d;
                if (account == null) {
                    j = ektg.a;
                } else {
                    List<Account> list = contactsConsentsConfig.h;
                    cvyz i2 = ContactsConsentData.i();
                    i2.d(list);
                    ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = contactsConsentsStatus.a;
                    i2.e(contactsConsentsCoarseStatus.a);
                    i2.f(contactsConsentsCoarseStatus.b);
                    i2.c(contactsConsentsCoarseStatus.c);
                    elhz G = elhz.G(contactsConsentsCoarseStatus.a());
                    if (i2.c != null) {
                        throw new IllegalStateException("Cannot set dcEligibleAndDisabledAccounts after calling dcEligibleAndDisabledAccountsBuilder()");
                    }
                    i2.d = elhz.G(G);
                    i2.g(0);
                    ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = contactsConsentsStatus.b;
                    if (contactsConsentsDetailedStatus != null) {
                        i2.g(contactsConsentsDetailedStatus.a);
                        for (Account account2 : list) {
                            i2.b(account2, contactsConsentsDetailedStatus.b.getInt(account2.name, 0));
                        }
                    }
                    ContactsConsentData a2 = i2.a();
                    cwcc o = ContactsConsentPrimitiveViewModel$ConsentUiData.o();
                    o.a = account;
                    o.b(contactsConsentsConfig.i ? 1 : 0);
                    o.c(contactsConsentsConfig);
                    o.d(a2);
                    o.e(enya.CHOICES_PAGE);
                    o.f(true != a2.k(account) ? 0 : 3);
                    o.l(true != ((C$AutoValue_ContactsConsentData) a2).c ? 0 : 3);
                    o.i(ContactsConsentPrimitiveViewModel$ConsentUiData.p(a2, contactsConsentsConfig, account));
                    j = ekvi.j(o.a());
                }
                if (j.h()) {
                    jwoVar.a("ui-data").l(j.c());
                } else {
                    cwceVar2.f.ih(new cwcd(2, null));
                }
                i = eqgc.i(contactsConsentsStatus.a.b());
            } else {
                Context context = cwceVar2.g;
                i = eqgc.i(auqx.h(context, context.getPackageName()));
            }
            eqgb h = eqgb.h(i);
            final cwai cwaiVar = cwceVar2.h;
            Objects.requireNonNull(cwaiVar);
            eqdv eqdvVar = new eqdv() { // from class: cwbh
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    return cwai.this.a((List) obj);
                }
            };
            eqgo eqgoVar = cwceVar2.d;
            eqgc.t(eqdl.g(h, eqdvVar, eqgoVar), new cwca(cwceVar2, contactsConsentsStatus), eqgoVar);
        }
        this.j.a().g(this, new jvs() { // from class: cvze
            @Override // defpackage.jvs
            public final void a(Object obj) {
                ContactsConsentPrimitiveViewModel$ConsentUiData contactsConsentPrimitiveViewModel$ConsentUiData = (ContactsConsentPrimitiveViewModel$ConsentUiData) obj;
                int ordinal = contactsConsentPrimitiveViewModel$ConsentUiData.k().ordinal();
                final ContactsConsentPrimitiveChimeraActivity contactsConsentPrimitiveChimeraActivity = ContactsConsentPrimitiveChimeraActivity.this;
                switch (ordinal) {
                    case 1:
                        dg g = contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().g(com.google.android.gms.R.id.root);
                        if (g != null) {
                            bp bpVar = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar.m(g);
                            bpVar.e();
                        }
                        contactsConsentPrimitiveChimeraActivity.setTheme(com.google.android.gms.R.style.ContactsPrimitiveActivityNoUiTheme);
                        contactsConsentPrimitiveChimeraActivity.findViewById(com.google.android.gms.R.id.root).setBackgroundResource(R.color.transparent);
                        if (contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("choices-tag") == null) {
                            contactsConsentPrimitiveChimeraActivity.j.g();
                            bp bpVar2 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar2.v(new cvzj(), "choices-tag");
                            bpVar2.e();
                            break;
                        }
                        break;
                    case 2:
                        dg h2 = contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("choices-tag");
                        if (h2 != null) {
                            bp bpVar3 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar3.m(h2);
                            bpVar3.e();
                        }
                        contactsConsentPrimitiveChimeraActivity.setTheme(com.google.android.gms.R.style.ContactsPrimitiveActivityFullPageTheme);
                        contactsConsentPrimitiveChimeraActivity.a();
                        if (contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("rec-tag") == null) {
                            contactsConsentPrimitiveChimeraActivity.j.g();
                            bp bpVar4 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar4.z(com.google.android.gms.R.id.root, new cwau(), "rec-tag");
                            bpVar4.e();
                            break;
                        }
                        break;
                    case 3:
                        dg h3 = contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("choices-tag");
                        if (h3 != null) {
                            bp bpVar5 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar5.m(h3);
                            bpVar5.e();
                        }
                        contactsConsentPrimitiveChimeraActivity.setTheme(com.google.android.gms.R.style.ContactsPrimitiveActivityFullPageTheme);
                        if (contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("dc-tag") == null) {
                            contactsConsentPrimitiveChimeraActivity.j.g();
                            bp bpVar6 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar6.z(com.google.android.gms.R.id.root, new cwam(), "dc-tag");
                            bpVar6.e();
                            contactsConsentPrimitiveChimeraActivity.a();
                            break;
                        }
                        break;
                    case 4:
                        dg h4 = contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("choices-tag");
                        if (h4 != null) {
                            bp bpVar7 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar7.m(h4);
                            bpVar7.e();
                        }
                        contactsConsentPrimitiveChimeraActivity.setTheme(com.google.android.gms.R.style.ContactsPrimitiveActivityFullPageTheme);
                        contactsConsentPrimitiveChimeraActivity.a();
                        if (contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("sheep-tag") == null) {
                            contactsConsentPrimitiveChimeraActivity.j.g();
                            bp bpVar8 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar8.z(com.google.android.gms.R.id.root, new cway(), "sheep-tag");
                            bpVar8.e();
                            break;
                        }
                        break;
                    case 5:
                        dg h5 = contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("choices-tag");
                        if (h5 != null) {
                            bp bpVar9 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar9.m(h5);
                            bpVar9.e();
                        }
                        contactsConsentPrimitiveChimeraActivity.setTheme(com.google.android.gms.R.style.ContactsPrimitiveActivityFullPageTheme);
                        contactsConsentPrimitiveChimeraActivity.a();
                        if (contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("sim-tag") == null) {
                            contactsConsentPrimitiveChimeraActivity.j.g();
                            bp bpVar10 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar10.z(com.google.android.gms.R.id.root, new cwbc(), "sim-tag");
                            bpVar10.e();
                            break;
                        }
                        break;
                    case 6:
                        dg h6 = contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("choices-tag");
                        if (h6 != null) {
                            bp bpVar11 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar11.m(h6);
                            bpVar11.e();
                        }
                        contactsConsentPrimitiveChimeraActivity.setTheme(com.google.android.gms.R.style.ContactsPrimitiveActivityFullPageTheme);
                        contactsConsentPrimitiveChimeraActivity.a();
                        if (contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager().h("finish-tag") == null) {
                            contactsConsentPrimitiveChimeraActivity.j.g();
                            bp bpVar12 = new bp(contactsConsentPrimitiveChimeraActivity.getSupportFragmentManager());
                            bpVar12.z(com.google.android.gms.R.id.root, new cvzm(), "finish-tag");
                            bpVar12.e();
                            break;
                        }
                        break;
                    case 8:
                        ContactsConsentData g2 = contactsConsentPrimitiveViewModel$ConsentUiData.g();
                        contactsConsentPrimitiveChimeraActivity.j.g();
                        View inflate = contactsConsentPrimitiveChimeraActivity.getLayoutInflater().inflate(com.google.android.gms.R.layout.consent_primitive_confirm_dismiss, (ViewGroup) null, false);
                        inflate.findViewById(com.google.android.gms.R.id.dc_off).setVisibility(true != g2.d().contains(contactsConsentPrimitiveViewModel$ConsentUiData.f()) ? 8 : 0);
                        TextView textView = (TextView) inflate.findViewById(com.google.android.gms.R.id.sheepdog_off);
                        textView.setVisibility(true != g2.g() ? 8 : 0);
                        int a3 = g2.a();
                        if (a3 == 0) {
                            textView.setText(com.google.android.gms.R.string.confirm_custom_page_sheepdog_zero_contacts);
                        } else {
                            textView.setText(contactsConsentPrimitiveChimeraActivity.getResources().getQuantityString(com.google.android.gms.R.plurals.sheepdog_leave_off_warning, a3, Integer.valueOf(a3)));
                        }
                        TextView textView2 = (TextView) inflate.findViewById(com.google.android.gms.R.id.sim_off);
                        textView2.setVisibility(true == g2.l(contactsConsentPrimitiveViewModel$ConsentUiData.f()) ? 0 : 8);
                        int c = contactsConsentPrimitiveViewModel$ConsentUiData.c();
                        textView2.setText(contactsConsentPrimitiveChimeraActivity.getResources().getQuantityString(com.google.android.gms.R.plurals.sim_leave_off_warning, c, Integer.valueOf(c)));
                        ip ipVar = new ip(contactsConsentPrimitiveChimeraActivity);
                        ipVar.l(com.google.android.gms.R.string.confirm_dismiss_title);
                        ipVar.c(false);
                        ipVar.setPositiveButton(com.google.android.gms.R.string.confirm_dismiss_accept, new DialogInterface.OnClickListener() { // from class: cvzc
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                final cwce cwceVar3 = ContactsConsentPrimitiveChimeraActivity.this.j;
                                cwceVar3.i(10, new ausk() { // from class: cwbu
                                    @Override // defpackage.ausk
                                    public final Object a(Object obj2) {
                                        cwce.this.f.l(new cwcd(4, null));
                                        return ((ContactsConsentPrimitiveViewModel$ConsentUiData) obj2).h();
                                    }
                                });
                            }
                        });
                        ipVar.setNegativeButton(com.google.android.gms.R.string.confirm_dismiss_change_settings, new DialogInterface.OnClickListener() { // from class: cvzd
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                ContactsConsentPrimitiveChimeraActivity.this.j.i(18, new ausk() { // from class: cwbg
                                    @Override // defpackage.ausk
                                    public final Object a(Object obj2) {
                                        ausn ausnVar = cwce.a;
                                        cwcc h7 = ((ContactsConsentPrimitiveViewModel$ConsentUiData) obj2).h();
                                        h7.e(enya.CHOICES_PAGE);
                                        return h7;
                                    }
                                });
                            }
                        });
                        ipVar.setView(inflate);
                        ipVar.create().show();
                        break;
                    case 9:
                        contactsConsentPrimitiveChimeraActivity.j.g();
                        View inflate2 = contactsConsentPrimitiveChimeraActivity.getLayoutInflater().inflate(com.google.android.gms.R.layout.consent_primitive_learn_more, (ViewGroup) null, false);
                        ((TextView) inflate2.findViewById(com.google.android.gms.R.id.header_1)).setText(com.google.android.gms.R.string.dc_learn_more_header_1);
                        ((TextView) inflate2.findViewById(com.google.android.gms.R.id.header_2)).setText(com.google.android.gms.R.string.dc_learn_more_header_2);
                        ((TextView) inflate2.findViewById(com.google.android.gms.R.id.header_3)).setText(com.google.android.gms.R.string.learn_more_manage_data_header);
                        ((TextView) inflate2.findViewById(com.google.android.gms.R.id.body_1)).setText(com.google.android.gms.R.string.dc_learn_more_body_1);
                        ((TextView) inflate2.findViewById(com.google.android.gms.R.id.body_2)).setText(com.google.android.gms.R.string.dc_learn_more_body_2);
                        ((TextView) inflate2.findViewById(com.google.android.gms.R.id.body_3)).setText(com.google.android.gms.R.string.dc_learn_more_body_3);
                        ip ipVar2 = new ip(contactsConsentPrimitiveChimeraActivity);
                        ipVar2.l(com.google.android.gms.R.string.dc_turn_on_header);
                        ipVar2.setPositiveButton(com.google.android.gms.R.string.common_got_it, new DialogInterface.OnClickListener() { // from class: cvza
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                ContactsConsentPrimitiveChimeraActivity.this.j.e();
                            }
                        });
                        ipVar2.setView(inflate2);
                        ipVar2.create().show();
                        break;
                    case 10:
                        contactsConsentPrimitiveChimeraActivity.j.g();
                        View inflate3 = contactsConsentPrimitiveChimeraActivity.getLayoutInflater().inflate(com.google.android.gms.R.layout.consent_primitive_learn_more, (ViewGroup) null, false);
                        ((TextView) inflate3.findViewById(com.google.android.gms.R.id.header_1)).setText(com.google.android.gms.R.string.learn_more_which_contacts_header);
                        ((TextView) inflate3.findViewById(com.google.android.gms.R.id.header_2)).setText(com.google.android.gms.R.string.learn_more_happen_header);
                        ((TextView) inflate3.findViewById(com.google.android.gms.R.id.header_3)).setText(com.google.android.gms.R.string.learn_more_manage_data_header);
                        ((TextView) inflate3.findViewById(com.google.android.gms.R.id.body_1)).setText(com.google.android.gms.R.string.sheepdog_learn_more_body_1);
                        ((TextView) inflate3.findViewById(com.google.android.gms.R.id.body_2)).setText(com.google.android.gms.R.string.sheepdog_learn_more_body_2);
                        ((TextView) inflate3.findViewById(com.google.android.gms.R.id.body_3)).setText(com.google.android.gms.R.string.sheepdog_learn_more_body_3);
                        ip ipVar3 = new ip(contactsConsentPrimitiveChimeraActivity);
                        ipVar3.l(com.google.android.gms.R.string.sheepdog_turn_on_header);
                        ipVar3.setPositiveButton(com.google.android.gms.R.string.common_got_it, new DialogInterface.OnClickListener() { // from class: cvzb
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                ContactsConsentPrimitiveChimeraActivity.this.j.e();
                            }
                        });
                        ipVar3.setView(inflate3);
                        ipVar3.create().show();
                        break;
                    case 11:
                        contactsConsentPrimitiveChimeraActivity.j.g();
                        View inflate4 = contactsConsentPrimitiveChimeraActivity.getLayoutInflater().inflate(com.google.android.gms.R.layout.consent_primitive_learn_more, (ViewGroup) null, false);
                        ((TextView) inflate4.findViewById(com.google.android.gms.R.id.header_1)).setText(com.google.android.gms.R.string.learn_more_which_contacts_header);
                        ((TextView) inflate4.findViewById(com.google.android.gms.R.id.header_2)).setText(com.google.android.gms.R.string.learn_more_happen_header);
                        ((TextView) inflate4.findViewById(com.google.android.gms.R.id.header_3)).setText(com.google.android.gms.R.string.learn_more_manage_data_header);
                        ((TextView) inflate4.findViewById(com.google.android.gms.R.id.body_1)).setText(com.google.android.gms.R.string.sim_learn_more_body_1);
                        ((TextView) inflate4.findViewById(com.google.android.gms.R.id.body_2)).setText(com.google.android.gms.R.string.sim_learn_more_body_2);
                        ((TextView) inflate4.findViewById(com.google.android.gms.R.id.body_3)).setText(com.google.android.gms.R.string.sim_learn_more_body_3);
                        ip ipVar4 = new ip(contactsConsentPrimitiveChimeraActivity);
                        ipVar4.l(com.google.android.gms.R.string.sim_turn_on_header);
                        ipVar4.setPositiveButton(com.google.android.gms.R.string.common_got_it, new DialogInterface.OnClickListener() { // from class: cvzg
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                ContactsConsentPrimitiveChimeraActivity.this.j.e();
                            }
                        });
                        ipVar4.setView(inflate4);
                        ipVar4.create().show();
                        break;
                }
            }
        });
        this.j.f.g(this, new jvs() { // from class: cvzf
            @Override // defpackage.jvs
            public final void a(Object obj) {
                cwcd cwcdVar = (cwcd) obj;
                int i3 = cwcdVar.a;
                ContactsConsentsResults contactsConsentsResults = cwcdVar.b;
                ContactsConsentPrimitiveChimeraActivity contactsConsentPrimitiveChimeraActivity = ContactsConsentPrimitiveChimeraActivity.this;
                if (contactsConsentsResults != null) {
                    Intent intent2 = new Intent();
                    atzs.l(contactsConsentsResults, intent2, "consentsResult");
                    contactsConsentPrimitiveChimeraActivity.setResult(i3, intent2);
                } else {
                    contactsConsentPrimitiveChimeraActivity.setResult(i3);
                }
                contactsConsentPrimitiveChimeraActivity.finish();
            }
        });
    }
}
