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
import defpackage.arwm;
import defpackage.asni;
import defpackage.azyw;
import defpackage.azzb;
import defpackage.azzc;
import defpackage.azzd;
import defpackage.pn;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class AutoCompleteTextView extends pn implements AdapterView.OnItemClickListener, TextWatcher {
    public azzd a;
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
        if (((azyw) getAdapter()) != null) {
            throw null;
        }
        azzd azzdVar = this.a;
        int i = contactMethod.a;
        azzc azzcVar = (azzc) azzdVar;
        int[] iArr = azzcVar.ah.h;
        if ((iArr == null || iArr.length == 0 || asni.d(iArr, i)) && !azzcVar.c.contains(contactMethod)) {
            azzcVar.A(azzc.x(contactMethod), contactMethod);
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
        azzc azzcVar = (azzc) this.a;
        if (azzcVar.D(contactPerson, contactMethod)) {
            azzcVar.z(contactPerson, contactMethod);
        } else {
            if (!azzcVar.y(contactPerson).isEmpty()) {
                if (contactMethod.a == 1) {
                    azzcVar.C();
                }
                azzb azzbVar = (azzb) azzcVar.b.get(contactPerson);
                arwm.s(azzbVar);
                List list = azzbVar.a;
                ContactPerson.ContactMethod contactMethod2 = (ContactPerson.ContactMethod) list.get(0);
                azzcVar.d.remove(new Pair(contactPerson, contactMethod2));
                azzcVar.B(contactPerson, contactMethod2);
                list.clear();
                list.add(contactMethod);
                azzcVar.E(contactPerson);
                throw null;
            }
            azzcVar.A(contactPerson, contactMethod);
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
