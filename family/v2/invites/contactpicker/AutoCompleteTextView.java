package com.google.android.gms.family.v2.invites.contactpicker;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;
import com.google.android.gms.family.v2.model.ContactPerson;
import defpackage.atzb;
import defpackage.aurc;
import defpackage.bccs;
import defpackage.bccx;
import defpackage.bccy;
import defpackage.bccz;
import defpackage.pp;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class AutoCompleteTextView extends pp implements AdapterView.OnItemClickListener, TextWatcher {
    public bccz a;
    public String b;
    private boolean c;

    public AutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSingleLine(false);
        setMaxLines(1);
        setOnItemClickListener(this);
        addTextChangedListener(this);
        setThreshold(1);
        setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        this.c = false;
        this.b = "";
    }

    public static ContactPerson.ContactMethod c(String str) {
        if (PhoneNumberUtils.isGlobalPhoneNumber(str)) {
            return new ContactPerson.ContactMethod(1, PhoneNumberUtils.formatNumber(str));
        }
        if (TextUtils.isEmpty(str) || !Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            return null;
        }
        return new ContactPerson.ContactMethod(0, str);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.c || isPerformingCompletion()) {
            return;
        }
        String obj = editable.toString();
        if (obj.contains(",") || obj.contains("\n")) {
            String replace = obj.replace("\n", "");
            if (replace.contains(",")) {
                replace = replace.substring(0, replace.indexOf(","));
            }
            ContactPerson.ContactMethod c = c(replace.trim());
            this.c = true;
            if (c == null) {
                setText(replace);
                setSelection(replace.length());
                Toast.makeText(getContext(), this.b, 1).show();
            } else {
                setText("");
                d(c);
            }
            this.c = false;
        }
    }

    public final void d(ContactPerson.ContactMethod contactMethod) {
        if (((bccs) getAdapter()) != null) {
            throw null;
        }
        bccz bcczVar = this.a;
        int i = contactMethod.a;
        bccy bccyVar = (bccy) bcczVar;
        int[] iArr = bccyVar.ah.h;
        if ((iArr == null || iArr.length == 0 || aurc.d(iArr, i)) && !bccyVar.c.contains(contactMethod)) {
            bccyVar.A(bccy.x(contactMethod), contactMethod);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Pair pair = (Pair) adapterView.getItemAtPosition(i);
        ContactPerson contactPerson = (ContactPerson) pair.first;
        ContactPerson.ContactMethod contactMethod = (ContactPerson.ContactMethod) pair.second;
        if (this.a.D(contactPerson, contactMethod)) {
            return;
        }
        bccy bccyVar = (bccy) this.a;
        if (bccyVar.D(contactPerson, contactMethod)) {
            bccyVar.z(contactPerson, contactMethod);
        } else {
            if (!bccyVar.y(contactPerson).isEmpty()) {
                if (contactMethod.a == 1) {
                    bccyVar.C();
                }
                bccx bccxVar = (bccx) bccyVar.b.get(contactPerson);
                atzb.s(bccxVar);
                List list = bccxVar.a;
                ContactPerson.ContactMethod contactMethod2 = (ContactPerson.ContactMethod) list.get(0);
                bccyVar.d.remove(new Pair(contactPerson, contactMethod2));
                bccyVar.B(contactPerson, contactMethod2);
                list.clear();
                list.add(contactMethod);
                bccyVar.E(contactPerson);
                throw null;
            }
            bccyVar.A(contactPerson, contactMethod);
        }
        setText("");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
